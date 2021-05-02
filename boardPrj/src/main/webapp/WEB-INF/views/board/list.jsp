<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
								href="detail?id=${n.id}">${n.title}</a></td>
							<td>${n.writer_id }</td>
							<td>${n.regdate }</td>
							<td>${n.hit }</td>
						</tr>
					</c:forEach>



				</tbody>
			</table>
			<div class="write-btn">
				<span></span>
				<a href="reg">글쓰기</a>
			</div>
			<div>
			</div>
		</div>
	</div>

</main>