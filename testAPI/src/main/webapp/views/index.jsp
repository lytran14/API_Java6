<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>Location Selector</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>

</head>
<body>
	<form action="/api/addresses/post" method="post">
		<div class="css_select_div">
			<select class="css_select" id="tinh" name="provinceId"
				title="Chọn Tỉnh Thành">
				<option value="0">Tỉnh Thành</option>
			</select> <select class="css_select" id="quan" name="districtId"
				title="Chọn Quận Huyện">
				<option value="0">Quận Huyện</option>
			</select> <select class="css_select" id="phuong" name="communeId"
				title="Chọn Phường Xã">
				<option value="0">Phường Xã</option>
			</select>
			<input type="text" name="street" placeholder="Nhập chi tiết">
			<button type="submit">Lưu</button>
		</div>
	</form>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
	<script src="/js/index.js"></script>


</body>
</html>