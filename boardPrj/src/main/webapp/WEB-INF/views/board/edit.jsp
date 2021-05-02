<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="csmain">
	<div>
		
		<form action="editboard" method="post" enctype="multipart/form-data">
		
			<div class="line">
				<span class="reg-tag">제목</span> 
				<input type="text" name="title" value="${board.title}" class="title-text">
			</div>
			
			<div class="line">
				<span> <span class="reg-tag">작성자</span>
					<input type="text" maxlength="6" name="writer_id" value="${board.writer_id}" class="writer-text">		
				</span> 
				
			</div>
			<div class="line">
				<span>	 <span class="reg-tag">첨부파일</span> 
					<input type="file" value="${board.files}" name="upload_file">
				</span> 
			</div>
			<div>
				<textarea class="contents" name="content" wrap="virtual" >${board.content}</textarea>
			</div>
			
			<div>
				<input type="hidden" value="${board.id}" name="id">
				<input type="submit" value="수정하기" class="write-btn2">
			</div>
		</form>
	</div>
</main>