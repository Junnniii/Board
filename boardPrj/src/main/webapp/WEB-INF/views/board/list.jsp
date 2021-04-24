<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main>
	<div class="u-container-style u-layout-cell u-size-42 u-layout-cell-2">
		<div class="u-container-layout u-container-layout-2">
		
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
			<td class="title text-align-left"><a href="detail?id=${n.id}">${n.title}</a></td>
			<td>${n.writer_id }</td>
			<td>${n.regdate }</td>
			<td>${n.hit }</td>
			</tr>
		</c:forEach>
			<!-- <tr class="list">
			<td>1</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>2</td>
			<td class="title text-align-left">테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa가나다라마바삼아자차가타파하</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>3</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>4</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>5</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>6</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>7</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>8</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>9</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td>
			
			</tr>
			<tr class="list">
			<td>10</td>
			<td>테스트2aaaaaaaaaaaaaaaaaaaaaaaaaaa</td>
			<td>테스트3</td>
			<td>테스트4</td>
			<td>테스트5</td> -->
			
		
			</tbody>
		</table>
		
		</div>
	</div>

</main>