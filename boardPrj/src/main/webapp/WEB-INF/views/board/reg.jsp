<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="csmain">
	<div>
		
		<form action="regboard" method="post" enctype="multipart/form-data">
		
			<div>제목 
				<input type="text" name="title" class="title-text">
			</div>
			
			<div>
				<span>작성자 
					<input type="text" name="writer_id" class="writer-text">		
				</span> 
				<span>첨부파일 
					<input type="file" name="file">
				</span> 
			</div>
			
			<div>
				<textarea name="content" >
				</textarea>
			</div>
			
			<div>
				<input type="submit" value="글쓰기" class="write-btn2">
			</div>
		</form>
	</div>
</main>