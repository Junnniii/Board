<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="page" value="${(empty param.p) ? 1 : param.p }"/>
<main>
	<div class="u-container-style u-layout-cell u-size-42 u-layout-cell-2">
		<div class="u-container-layout u-container-layout-2">
			<form class="search-list">
					<select name="f">
						<option>제목</option>
						<option>작성자</option>
					</select> 
					<input type="text" name="q"> 
					<input type="submit" value="검색">
			</form>
			<table>
				

				<thead class="table_header">
					<tr>
						<td class="w60">번호</td>
						<td class="expand w450">제목</td>
						<td class="w100">글쓴이</td>
						<td class="w100">작성일</td>
						<td class="w60">조회수</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="n" items="${list}">
						<tr>
							<td>${n.id}</td>
							<td class="title text-align-left"><a
								href="detail?id=${n.id}&p=${param.p}&q=${param.q}&f=${param.f}">${n.title}</a></td>
							<td>${n.writer_id }</td>
							<td><fmt:formatDate value="${n.regdate }" pattern="yyyy-MM-dd" type="date"/> </td>
							<td>${n.hit }</td>
						</tr>
					</c:forEach>



				</tbody>
				
				
				
			</table>
			
			
			<c:set var="startNum" value="${page-(page-1)%5 }"/>
			<c:set var="lastNum" value="${fn:substringBefore(Math.ceil(count/10),'.')}"/>
			
			<c:if test="${startNum > 1}">
				<a href="?p=${startNum-1}&f=${param.f}&q=${param.q}" class="prev-btn">이전</a>
			</c:if>
			<div class="page-btn">
				<c:forEach var="i" begin="0" end="4">
					<c:if test="${(startNum+i) <= lastNum }">
						<a href="?p=${startNum+i}&f=${param.f}&q=${param.q}" class="${(page == startNum+i) ? 'page-emphasis' : 'page-nemp' }">${startNum+i}</a>
					</c:if>
				</c:forEach>	
			</div>
			<c:if test="${startNum+5 <= lastNum}">
			<a href="?p=${startNum+5}&f=${param.f}&q=${param.q}" class="next-btn">다음</a>
			</c:if>
			<div class="write-btn">
				<a href="reg">글쓰기</a>
			</div>
			<div>
			</div>
		</div>
	</div>

</main>