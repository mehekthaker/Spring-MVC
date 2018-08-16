package com.cg.springmvc.controller.bank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.moneymoney.app.model.service.ServiceImpl;
import com.moneymoney.framework.account.pojo.BankAccount;


@Controller
public class BankController {
	ServiceImpl service = new ServiceImpl();

	@RequestMapping("deposit.app")
	public String deposit() {
		
		return "deposit";
	}
	
	@RequestMapping("depositAmount.app")
	public String deposit(@RequestParam("accNo") int accNo, @RequestParam("depositamount") double amount, Model model) {
		double result = service.deposit(accNo, amount);
		model.addAttribute("result", result);
		model.addAttribute("bankAccount", service.searchAccountById(accNo));
		model.addAttribute("classType", service.getClass().getSimpleName());
		return "ViewAccount";
	}
	
	
	
	@RequestMapping("withdraw.app")
	public String withdraw() {
		
		return "withdraw";
	}
	
	@RequestMapping("withdrawAmount.app")
	public String withdraw(@RequestParam("accNo") int accNo, @RequestParam("withdrawamount") double amount, Model model) {
		String result = service.withdraw(accNo, amount);
		model.addAttribute("result", result);
		model.addAttribute("bankAccount", service.searchAccountById(accNo));
		model.addAttribute("classType", service.searchAccountById(accNo).getClass().getSimpleName());
		return "ViewAccount";
	}
	
	
	
	@RequestMapping("fundTransfer.app")
	public String fundTransfer() {
		
		return "fundTransfer";
	}
	
	@RequestMapping("transfer.app")
	public String fundTransfer(@RequestParam("sender") BankAccount sender, @RequestParam("reciever") BankAccount reciever, @RequestParam("amount") double amount, Model model) {
		boolean result = service.FundTransfer(sender, reciever, amount);
		if(result == true)
			System.out.println("Payment Successful");
		else
			System.out.println("Payment unsuccesful");
		model.addAttribute("result", result);
		model.addAttribute("fundTransfer", service.FundTransfer(sender, reciever, amount));
		return "viewAccount";
	}
}
