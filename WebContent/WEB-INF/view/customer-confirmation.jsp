<!--  JSTL Tag for using for loop -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<title>Customer confirmation page</title>
<body>

First Name : ${customer.firstName}

<br></br>

Last Name : ${customer.lastName}

<br></br>

Free Passes : ${customer.freePasses}

<br><br>

Post Code :${customer.postalCode}
</body>
</html>