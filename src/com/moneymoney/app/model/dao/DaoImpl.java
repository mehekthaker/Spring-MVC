package com.moneymoney.app.model.dao;

import java.util.ArrayList;

import com.moneymoney.app.model.account.pojo.MMCurrentAccount;
import com.moneymoney.app.model.account.pojo.MMCustomer;
import com.moneymoney.app.model.account.pojo.MMSavingsAccount;
import com.moneymoney.framework.account.dao.DAO;
import com.moneymoney.framework.account.pojo.BankAccount;
import com.moneymoney.framework.account.pojo.Customer;

public class DaoImpl implements DAO{
	private static ArrayList<BankAccount> bankAccList  = new ArrayList<>();
	private static ArrayList<Customer> customerList = new ArrayList<>();
	
	public DaoImpl() {
		Customer C1 = new MMCustomer("Ryan D'souza", 998870066, "2/6/1880", "ryan@gmail.com");
		BankAccount c1 = new MMSavingsAccount(C1 , 34000, true);
		addBankAccount(c1);
		
		Customer C2 = new MMCustomer("Sheema Khan", 998870066, "12/7/1880", "sheema@gmail.com");
		BankAccount c2 = new MMCurrentAccount(C2 , 90000, 3000);
		addBankAccount(c2);
		
		Customer C3 = new MMCustomer("Aish Patel", 998870066, "21/3/1884", "aish@gmail.com");
		BankAccount c3 = new MMSavingsAccount(C3 , 56000, true);
		addBankAccount(c3);
		
		Customer C4 = new MMCustomer("Rose Dsa", 998870066, "7/8/1889", "rose@gmail.com");
		BankAccount c4 = new MMCurrentAccount(C4 , 987000, 1000);
		addBankAccount(c4);
		
		Customer C5 = new MMCustomer("Pristina Rosetti", 998870066, "23/10/1980", "prist@gmail.com");
		BankAccount c5 = new MMSavingsAccount(C5 , 50000, true);
		addBankAccount(c5);
		
		Customer C6 = new MMCustomer("Myra Gill", 998870066, "4/1/1990", "myra@gmail.com");
		BankAccount c6 = new MMCurrentAccount(C6 , 233000, 4000);
		addBankAccount(c6);
		
		Customer C7 = new MMCustomer("Sameer Sehgal", 998870066, "10/6/1996", "sameer@gmail.com");
		BankAccount c7 = new MMSavingsAccount(C7 , 198000, true);
		addBankAccount(c7);
		
		
	}

	@Override
	public void addBankAccount(BankAccount bankAccount) {
		bankAccList.add(bankAccount);
		
	}

	@Override
	public void addCustomer(Customer customer) {
		customerList.add(customer);
		
	}

	@Override
	public ArrayList<BankAccount> viewAllAccounts() {
		return bankAccList;
	}

	@Override
	public ArrayList<Customer> viewAllCustomers() {
		return customerList;
	}

	@Override
	public BankAccount searchAccountById(int num) {
		BankAccount account = null;
		for(BankAccount ba: bankAccList) {
			if(ba.getAccountNumber() == num) {
				account=ba;
			}
		}
		return account;
	}

}
