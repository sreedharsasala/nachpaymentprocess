<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Spring MVC Form Handling</title>
	</head>
	<body>
	<center>
		<h2>Create New Publication</h2>
		<form:form method="POST" action="savePublication.do">
	   		<table>
	   		 <tr>
			        <td><form:label path="donorid">DonorId :</form:label></td>
			        <td><form:input path="donorid" value="${publication.donorid}" readonly="true"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="trustid">centerid ID:</form:label></td>
			        <td><form:input path="trustid" value="${publication.trustid}" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="centerid">donorid Title:</form:label></td>
			        <td><form:input path="centerid" value="${publication.centerid}"/></td>
			    </tr>
			    		   		    
			     <tr>
			        <td><form:label path="salitation">sirstname Title:</form:label></td>
			        <td><form:input path="salitation" value="${publication.salitation}"/></td>
			    </tr>
			  	<tr>
				    <td>
				    	<form:label path="category.contactid">Publication Type:</form:label>
				    </td>
				    <td>
				   		<form:select path="category.contactid" cssStyle="width: 150px;">    
							<option value="-1">Select a type</option>
							<c:forEach items="${categories}" var="category">
								<option value="${category.contactid}">${category.contact_name}</option>
							</c:forEach>
						</form:select>
					</td>
			    </tr>
			    <tr>
			        <td><form:label path="lastnamem">LastNamem :</form:label></td>
			        <td><form:textarea path="lastnamem" value="${publication.lastnamem}" cssStyle="width: 150px;"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="spousename">SpouseName :</form:label></td>
			        <td><form:input path="spousename" value="${publication.spousename}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="dateofbirth">DateOfBirth:</form:label></td>
			        <td><form:input path="dateofbirth" value="${publication.dateofbirth}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="nationality">Nationality :</form:label></td>
			        <td><form:input path="nationality" value="${publication.nationality}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="registeredon">Registeredon :</form:label></td>
			        <td><form:input path="registeredon" value=""/></td>
			    </tr>
			    <tr>
			        <td><form:label path="preachercode">PreacherCode :</form:label></td>
			        <td><form:input path="preachercode" value="${publication.preachercode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="currprcrcode">Currprcrcode :</form:label></td>
			        <td><form:input path="currprcrcode" value="${publication.currprcrcode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="allocprercode">Allocprercode :</form:label></td>
			        <td><form:input path="allocprercode" value="${publication.allocprercode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="branchcode">Branchcode :</form:label></td>
			        <td><form:input path="branchcode" value="${publication.branchcode}"/></td>
			    </tr>
			    <tr>
			        <td><form:label path="lastdonationdate">Lastdonationdate :</form:label></td>
			        <td><form:input path="lastdonationdate" value=""/></td>
			    </tr>
			      <tr>
			        <td><form:label path="remarks">Remarks :</form:label></td>
			        <td><form:input path="remarks" value="${publication.remarks}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="createdby">Createdby :</form:label></td>
			        <td><form:input path="createdby" value="${publication.createdby}"/></td>
			    </tr>
			    <%--   <tr>
			        <td><form:label path="createon">CreatedOn :</form:label></td>
			        <td><form:input path="createon" value="<%= (new java.util.Date()).toLocaleString()%>"/></td> -->
			    </tr> --%>
			     <tr>
			        <td><form:label path="verifiedby">Verifiedby :</form:label></td>
			        <td><form:input path="verifiedby" value="${publication.verifiedby}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="modifiedby">Modifiedby :</form:label></td>
			        <td><form:input path="modifiedby" value="${publication.modifiedby}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="empid">Empid :</form:label></td>
			        <td><form:input path="empid" value="${publication.empid}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="empaddress">Empaddress :</form:label></td>
			        <td><form:input path="empaddress" value="${publication.empaddress}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="empAge">EmpAge :</form:label></td>
			        <td><form:input path="empAge" value="${publication.empAge}"/></td>
			    </tr>
			     <tr>
			        <td><form:label path="empname">empname :</form:label></td>
			        <td><form:input path="empname" value="${publication.empname}"/></td>
			    </tr>
			      <tr>
			        <td><form:label path="salary">salary :</form:label></td>
			        <td><form:input path="salary" value="${publication.salary}"/></td>
			    </tr>
			    <tr>
			      <td>&nbsp;</td>
			      <td><input type="submit" value="SAVE"/></td>
		      </tr>
			</table> 
		</form:form>
		<br/>
  <c:if test="${!empty publications}">
	<table align="center" border="1">
		<tr>
			<th>DONOR ID</th>
			<th>Spouse Name</th>
			<th>Contact_name</th>
			<th>Contact ID</th>
			<th>Content</th>
			<th>Email_ID</th>
			<th>ContactDetails ID</th>
		</tr>

		<c:forEach items="${publications}" var="publication">
			<tr>
				<td><c:out value="${publication.donorid}"/></td>
				<td><c:out value="${publication.spousename}"/></td>
				<td><c:out value="${publication.category.contact_name}"/></td>
				<td><c:out value="${publication.category.contactid}"/></td>
				<td><c:out value="${publication.empid}"/></td>
				<td><c:out value="${publication.category}"/></td>
				<td align="center"><a href="editPublication.do?donorid=${publication.donorid}">Edit</a> | <a href="deletePublication.do?donorid=${publication.donorid}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
<h2><a href="addCategory.do">Adding Category</a></h2>
</center>
	</body>
</html>