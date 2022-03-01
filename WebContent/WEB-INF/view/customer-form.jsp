<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>

<html>
<title>Customer Registeration</title>
<style>
		.error
		{color.red}
	</style>
<body>
<form:form action="processForm" modelAttribute="customer">


First Name<form:input path="firstName"/>
<br></br>

Last Name (*)<form:input path="lastName"/>

<!-- This will display the error message if it is set -->
<form:errors path="lastName" cssClass="error"/>

<br></br>

Free Passes <form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>

Post Code <form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>


<input type="submit" value="submit"/>



</form:form>
</body>
</html>