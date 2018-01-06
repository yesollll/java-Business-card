<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 목록</title>
<style>
@import url(http://fonts.googleapis.com/earlyaccess/nanumgothic.css);
body{
	font-family: 'Nanum Gothic', sans-serif;
}
</style>
<script type="text/javascript">
	function move(url){
		location.href=url;
	}
</script>
</head>
<body>
<!-- marquee는 움직이는 텍스트 만드는 태그 
alternate는 좌우로 왔다갔다함  scrolldelay는 스크롤이 되는 시간 간격을 1/100초 단위로 지정-->
	<marquee behavior="alternate" scrolldelay="100" direction="right">
	내가만든 홈페이지입니다~~~~
	</marquee>
	<table class="bbs" width="800" height="200" border="2" bgcolor="D8D8D8">
		<!-- colgroup은 테이블의 한행을 기준으로 일괄적인 디자인을 적용하고자 할때 유용 -->
		<colgroup>
			<col width="50" />
			<col width="500" />
			<col width="100" />
			<col width="50" />
		</colgroup>
		<thead>
			<tr>
				<th>번 호</th>
				<th>제 목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조 회</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td align="center">3</td>
				<td><a href="Board_View.jsp">게시판 글입니다 3</a></td>
				<td align="center">예솔</td>
				<td align="center">2017/12/27</td>
				<td align="center">1227</td>
			</tr>
			<tr>
				<td align="center">2</td>
				<td><a href="Board_View.jsp">게시판 글입니다 2</a></td>
				<td align="center">예솔</td>
				<td align="center">2017/12/27</td>
				<td align="center">122</td>
			</tr>
			<tr>
				<td align="center">1</td>
				<td><a href="Board_View.jsp">게시판 글입니다 1</a></td>
				<td align="center">예솔</td>
				<td align="center">2017/12/27</td>
				<td align="center">12</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td align="center" colspan="5">1</td>
			</tr>
		</tfoot>
	</table>
		<input type="button" value="처음으로" onClick="move('Borad_List.jsp');" />
		<input type="button" value="글쓰기" onClick="move('Borad_Write.jsp');" />
</body>
</html>