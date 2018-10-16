<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Ens</title>
</head>
<body>
 <h1>Eka</h1>
<c:out value="${method}"/>
<br><br/>
<c:out value="${test}"/>
<br><br/>
<form:form method="POST" action="/WebMvcInt/">
    <%/* <input type="hidden" name="request" value="Arvo"/> */%>
    <input name="request"/><br/>
    <input type="submit" value="Mita kuuluu"/>
</form:form>
<br><br/>
<button onclick="location.href='\second'" type="button">
     tokalle</button>


</body>
</html>