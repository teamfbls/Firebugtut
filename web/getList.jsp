<%@ page language="java" contentType="text/json; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="list" class="beans.Addresses"/>
<jsp:setProperty property="page" name="list"/>
[
<c:forEach var="a" items="${list.adresses}" varStatus="loopState">
	{
		"name": "${a.name }",
		"christianname": "${a.christianname }",
		"email": "${a.email }",
		"phone": "${a.mobil }"
	}
	<c:if test="${!loopState.isLast()}">,</c:if>
</c:forEach>
]
