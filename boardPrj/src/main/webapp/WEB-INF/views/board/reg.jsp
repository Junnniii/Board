<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<main class="csmain">
	<div>
		
		<form action="regboard" method="post" enctype="multipart/form-data">
		
			<div class="line">
				<span class="reg-tag">제목</span> 
				<input type="text" name="title" class="title-text">
			</div>
			
			<div class="line">
				<span> <span class="reg-tag">작성자</span>
					<input type="text" name="writer_id" class="writer-text">		
				</span> 
				
			</div>
			<div class="line">
				<span>	 <span class="reg-tag">첨부파일</span> 
					<input type="file" name="upload_file">
				</span> 
			</div>
			<div>
				<textarea class="contents" name="content" wrap="virtual" ></textarea>
			</div>
			
			<div>
				<input type="submit" value="글쓰기" class="write-btn2">
			</div>
		</form>
	</div>
</main>