<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>

<body>

<form:form action="processForm" modelAttribute="student">


First Name :<form:input path="firstName"/>

<br><br>

Last Name:<form:input  path="lastName"/>



<br>Faourite Country</br>

Country :


<!-- Adding Spring MVC Select tag -->
	
<form:select path="country">

		<form:options items="${student.countryOptions}"/> 

		 	<%-- <form:option value="India" label="India"/>
		  	<form:option value="rance" label="France"/>
		   	<form:option value="Germany" label="Germany"/>
		    <form:option value="Brazil" label="Brazil"/>
		    <form:option value="Russia" label="Russia"/>
  --%>
 <br><br>
 
 
  <br>Favourite Language</br>
  
 
 
    Java<form:radiobutton path="favLang" value="Java"/>
    c++<form:radiobutton path="favLang" value="c++"/>
      python<form:radiobutton path="favLang" value="Python"/>
        Go<form:radiobutton path="favLang" value="Go"/>
          php<form:radiobutton path="favLang" value="php"/>
          
          <br>Operating Systems/br>
          
         MAC <form:checkbox path="favOs" value="MAC"/>
         Linux <form:checkbox path="favOs" value="linux"/>
          Windows <form:checkbox path="favOs" value="Windows"/>
           Android <form:checkbox path="favOs" value="Android"/>

<input type="submit" value="submit"/> 



</form:select>

</form:form>








</body>






</html>