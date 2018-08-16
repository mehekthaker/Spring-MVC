<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
<style>
body {
	background-color: palegoldenrod;
}
</style>
</head>
<body>
<div>
	<jsp:include page="header.jsp"></jsp:include>
</div>
<div align="center">
<table>
	<!--  <tr><td><a href="addNewAccount">Add New Account</a></td></tr> -->
	<!--  <tr><td><a href="viewAllCustomers">View All Customers</a></td></tr> -->
	<!--  <tr><td><a href="searchAccount">Search Account</a></td></tr> -->
	<tr><td><a href="withdraw.app">Withdraw Amount</a></td></tr>
	<tr><td><a href="deposit.app">Deposit Amount</a></td></tr>
	<tr><td><a href="fundTransfer.app">Fund Transfer</a></td></tr>
</table>
</div>
<div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>