<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/testmaven/update" method="post"
		enctype="multipart/form-data">
		<h2>Thay đổi thông tin tài khoản</h2>
		<c:if test="${alert !=null}">
			<h3 class="alert alertdanger">${alert}</h3>
		</c:if>
		<section>
			<label class="input login-input">
				<div class="input-group">
					<span class="input-group-addon"><i class="fa fa-user"></i></span> 
					<h3>
						<img src="${sessionScope.account.avatar}" style="width: 100px; height: 70px;">
						Tài khoản: ${sessionScope.account.username}
					</h3>
					<input type="hidden" name="username" value="${sessionScope.account.username}" />
					<br>
					<input
						type="text" placeholder="Họ tên" name="fullname"
						class="form-control"> 
					<br> 
					<input type="text"
						placeholder="Số điện thoại" name="phone" class="form-control">
					<br> 
					Chọn file: <input type="file" name="avatar" />
					<br> 
				 	<input
						type="Submit" value="Submit" />
				</div>
			</label>
		</section>
</body>
</html>