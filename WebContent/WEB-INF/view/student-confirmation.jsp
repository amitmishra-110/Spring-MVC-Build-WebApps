<!--  JSTL Tag for using for loop -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>

<html>

<title>Student Confirmation Page</title>

<body>

The Student is Confirmed : ${student.firstName} ${student.lastName} 


<br><br>
<br><br>
<br><br>


<!-- student is the object that will be same in method with ModelAttribute and country is dropdown list path -->
Country : ${student.country}

<BR><BR>

Favourite Language : ${student.favLang}


<BR><BR>

Favourite OS :
<ul>
<c:forEach var="temp" items="${student.favOs}">
<li> ${temp} </li>

 </c:forEach>

</ul>





</body>

</html>