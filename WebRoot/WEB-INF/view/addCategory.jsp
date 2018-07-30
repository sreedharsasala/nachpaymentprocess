<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html;charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body><center>
		<h2>Create New Category</h2>
		<form:form method="POST" action="saveCategory.do" name="command">
	   		<table>
			    <tr>
			        <td><form:label path="contactid">Contact ID:</form:label></td>
			        <td><form:input path="contactid" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="contact_name">Contact Name:</form:label></td>
			        <td><form:input path="contact_name" value="${category.contact_name}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="resaddline1">Resaddline1:</form:label></td>
			        <td><form:input path="resaddline1" value="${category.resaddline1}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="resaddline2">Resaddline2:</form:label></td>
			        <td><form:input path="resaddline2" value="${category.resaddline2}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="resaddline3">Resaddline3:</form:label></td>
			        <td><form:input path="resaddline3" value="${category.resaddline3}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="resaddline4">Resaddline4:</form:label></td>
			        <td><form:input path="resaddline4" value="${category.resaddline4}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="resaddline5">Resaddline5:</form:label></td>
			        <td><form:input path="resaddline5" value="${category.resaddline5}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="respincode">RespinCode:</form:label></td>
			        <td><form:input path="respincode" value="${category.respincode}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="rescitycode">RescityCode:</form:label></td>
			        <td><form:input path="rescitycode" value="${category.rescitycode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="resstatecode">ResstateCode:</form:label></td>
			        <td><form:input path="resstatecode" value="${category.resstatecode}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="rescntrycode">RescntryCode:</form:label></td>
			        <td><form:input path="rescntrycode" value="${category.rescntrycode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="offaddrline1">OffaddrLine1:</form:label></td>
			        <td><form:input path="offaddrline1" value="${category.offaddrline1}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="offaddrline2">OffaddrLine2:</form:label></td>
			        <td><form:input path="offaddrline2" value="${category.offaddrline2}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="offaddrline3">OffaddrLine3:</form:label></td>
			        <td><form:input path="offaddrline3" value="${category.offaddrline3}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="offaddrline4">OffaddrLine4:</form:label></td>
			        <td><form:input path="offaddrline4" value="${category.offaddrline4}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="offaddrline5">OffaddrLine5:</form:label></td>
			        <td><form:input path="offaddrline5" value="${category.offaddrline5}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="offpincode">OffpinCode:</form:label></td>
			        <td><form:input path="offpincode" value="${category.offpincode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="offcitycode">OffcityCode:</form:label></td>
			        <td><form:input path="offcitycode" value="${category.offcitycode}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="offstatecode">OffStateCode:</form:label></td>
			        <td><form:input path="offstatecode" value="${category.offstatecode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="offcntrycode">OffCntryCode:</form:label></td>
			        <td><form:input path="offcntrycode" value="${category.offcntrycode}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="mailingpref">MailingPref</form:label></td>
			        <td><form:input path="mailingpref" value="${category.mailingpref}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="resphone">ResPhone:</form:label></td>
			        <td><form:input path="resphone" value="${category.resphone}"/></td>
			    </tr>
			    
			     <tr>
			        <td><form:label path="offphone">OffPhone:</form:label></td>
			        <td><form:input path="offphone" value="${category.offphone}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="mobile1">Moble1:</form:label></td>
			        <td><form:input path="mobile1" value="${category.mobile1}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="mobile2">Mobile2:</form:label></td>
			        <td><form:input path="mobile2" value="${category.mobile2}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="phone1">Phone1:</form:label></td>
			        <td><form:input path="phone1" value="${category.phone1}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="phone2">Phone2</form:label></td>
			        <td><form:input path="phone2" value="${category.phone2}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="faxnumber">FaxNumber:</form:label></td>
			        <td><form:input path="faxnumber" value="${category.faxnumber}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="email1">Email1:</form:label></td>
			        <td><form:input path="email1" value="${category.email1}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="email2">Email2:</form:label></td>
			        <td><form:input path="email2" value="${category.email2}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="verified">VeryFied:</form:label></td>
			        <td><form:input path="verified" value="${category.verified}"/></td>
			    </tr>
			   <%--  <tr>
			        <td><form:label path="createdby">Created by:</form:label></td>
			        <td><form:input path="createdby" value="<%= (new java.util.Date()).toLocaleString()%>"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="createdon">Created On:</form:label></td>
			        <td><form:input path="createdon" value="<%= (new java.util.Date()).toLocaleString()%>"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="modifidby">Modifid by:</form:label></td>
			        <td><form:input path="modifidby" value="<%= (new java.util.Date()).toLocaleString()%>"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="modifideon">modifide On:</form:label></td>
			        <td><form:input path="modifideon" value="<%= (new java.util.Date()).toLocaleString()%>"/></td>
			    </tr>  --%>
			   			    
			   	<tr>
			    <tr>
			    	<td>&nbsp;</td>
			      <td><input type="submit" value="SAVE"/></td>
		      	</tr>
			</table> 
		</form:form>
		<br/>
   <c:if test="${!empty categories}">
	<table align="center" border="1">
		<tr>
			<th>Category ID</th>
			<th>Category Name</th>
			<th>Options</th>
		</tr>

		<c:forEach items="${categories}" var="category">
			<tr>
				<td><c:out value="${category.contactid}"/></td>
				<td><c:out value="${category.contact_name}"/></td>
				<td align="center"><a href="editCategory.do?contactid=${category.contactid}">Edit</a> | <a href="deleteCategory.do?contactid=${category.contactid}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if> 
<h2><a href="addPublication.do">Adding Publication</a></h2>
</center>
	</body>
</html>