<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello World!</h2>
<form action="order.do" method="post">
<pre>
Order From   <input type="text" name="orderFrom"/>
Phone Number <input type="text" name="phoneNo"/>
Card Type    <select name="cardType">
               <option>SELECT</option>
               <option>Marriage</option>
               <option>Birthday</option>
               <option>House Warming</option>
               <option>Pooja</option>
</select>
No Of Copies <input type="text" name="noOfCopies"/>
Content      <textarea rows="5" cols="30" name="content"></textarea>
<input type="submit" value="order" />
</pre>
</form>
</body>
</html>