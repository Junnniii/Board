<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<main>

	<div class="board">
		<div class="head-title">${board.title }</div>
		<div class="head-info">
			<span class="info">작성자</span> <span class="board_info">${board.writer_id }</span>

			<span class="info">조회수</span> <span class="board_info">${board.hit}</span>
			<span class="info">작성일</span> <span class="board_info"><fmt:formatDate value="${board.regdate}" pattern="yy-MM-dd hh:mm" type="date"/></span>

		</div>
		<div class="head-file">
			<span class="file">첨부파일</span> 
			<span class="">
				<a href="/file/download?filename=${board.files}">${board.files}</a>
			</span>
		</div>
		<div class="content">${board.content}</div>


	</div>
	<div class="board-foot">
		<div class="board-page">
		 <a href="">이전글</a>
		 <a href="list">목록</a> 
		 <a href="">다음글</a> 
		</div>
		<div class="board-btn">
	
			 
			 <a href="edit?id=${board.id}">수정</a>
	
			 <a href="delete?id=${board.id}">삭제</a>
		</div>
	</div>

</main>