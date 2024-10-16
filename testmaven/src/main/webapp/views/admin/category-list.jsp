<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core"%>

<a href="${pageContext.request.contextPath}/admin/category/add">Add
	category</a>
<br>
<label for="categorysearch">Seach category:</label>
<form action="${pageContext.request.contextPath}/admin/category/search"
	method="get">
	<input type="text" id="categoryname" name="categoryname"> <input
		type="submit" value="Search">
</form>
<table border="1" width="1">
	<tr>
		<th>STT</th>
		<th>Images</th>
		<th>Categoryid</th>
		<th>Categoryname</th>
		<th>Status</th>
		<th>Action</th>
	</tr>

	<c:forEach items="${listcate}" var="cate" varStatus="STT">
		<tr>
			<td>${STT.index+1}</td>
			<c:choose>
				<c:when test="${cate.images.substring(0,5)=='https'}">
					<c:url value="${cate.images}" var="imgUrl"></c:url>
				</c:when>
				<c:otherwise>
					<c:url value="/image?fname=${cate.images}" var="imgUrl"></c:url>
				</c:otherwise>
			</c:choose>
			<td><img height="150" width="200" src="${imgUrl}" /></td>
			<td>${cate.categoryid}</td>
			<td>${cate.categoryname}</td>
			<c:choose>
				<c:when test="${cate.status==1}">
					<td>Hoạt Động</td>
				</c:when>
				<c:otherwise>
					<td>Khóa</td>
				</c:otherwise>
			</c:choose>
			<td><a
				href="<c:url value='/admin/category/edit?id=${cate.categoryid }'/>">Sửa</a>
				| <a
				href="<c:url value='/admin/category/delete?id=${cate.categoryid }'/>">Xóa</a></td>
		</tr>
	</c:forEach>
</table>