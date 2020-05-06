<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title></title>
<link href="/resource/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resource/js/bootstrap.min.js"></script>
</head>
<body>
<form action="list" method="post">
<!--姓名模糊查询（2分）
	手机模糊查询（2分）
	房型模糊查询（2分）
	房价范围查询（3分） 
	预订日期范围查询（3分）
 -->
	<input type="hidden" name="pageNum">
	姓名<input type="text" name="name" value="${v.name }">
	手机<input type="text" name="phone" value="${v.phone }">
	房型<input type="text" name="type" value="${v.type }">
	房价<input type="text" name="p1" value="${v.p1 }">-<input type="text" name="p2" value="${v.p2 }">
	预定日期<input type="date" name="d1" value="${v.d1 }">-<input type="date" name="d2" value="${v.d2 }">
	<input type="submit" value="查询">
</form>
<table class="table table-info">
	<tr>
		<td>预定日期</td>
		<td>姓名</td>
		<td>手机</td>
		<td>房型</td>
		<td>房价</td>
		<td>备注</td>
	</tr>
	<c:forEach items="${info.list }" var="s">
		<tr>
		<td><fmt:formatDate type="both" dateStyle="long" timeStyle="long" value="${s.creatdate }"/></td>
		<td>${s.cname }</td>
		<td>${s.cphone }</td>
		<td>${s.name }</td>
		<td>${s.cprice }</td>
		<td>${s.cbei }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="20">
			总记录${info.total }/总页数${info.pages }
			<nav aria-label="Page navigation example">
  <ul class="pagination">
    <li class="page-item">
      <a class="page-link" href="#" onclick="gopage(${info.prePage==0?1:info.prePage})" aria-label="Previous">
        <span aria-hidden="true">&laquo;</span>
      </a>
    </li>
    <li class="page-item"><a class="page-link" onclick="gopage(1)"  href="#">1</a></li>
    <li class="page-item"><a class="page-link" onclick="gopage(2)" href="#">2</a></li>
    <li class="page-item"><a class="page-link" onclick="gopage(3)" href="#">3</a></li>
    <li class="page-item">
      <a class="page-link" href="#" onclick="gopage(${info.nextPage==0?1:info.nextPage})"  aria-label="Next">
        <span aria-hidden="true">&raquo;</span>
      </a>
    </li>
  </ul>
</nav>
		</td>
	</tr>
</table>
</body>
<script type="text/javascript">
function gopage(pageNum) {
	$("[name=pageNum]").val(pageNum);
	$("form").submit();
}
</script>
</html>