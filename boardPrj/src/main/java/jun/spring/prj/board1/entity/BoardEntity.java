package jun.spring.prj.board1.entity;

import java.sql.Date;


public class BoardEntity {
	
	private Integer id;
	private String title;
	private String writer_id;
	private Date regdate;
	private String content;
	private Integer hit;
	private String files;
	private Boolean pub;
	
	
	public BoardEntity(Integer id, String title, String writer_id, String content,Date regdate, Integer hit, String files,
			Boolean pub) {
		super();
		this.id = id;
		this.title = title;
		this.writer_id = writer_id;
		this.regdate = regdate;
		this.content = content;
		this.hit = hit;
		this.files = files;
		this.pub = pub;
	}





	public BoardEntity() {
		super();
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getWriter_id() {
		return writer_id;
	}


	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Integer getHit() {
		return hit;
	}


	public void setHit(Integer hit) {
		this.hit = hit;
	}


	public String getFiles() {
		return files;
	}


	public void setFiles(String files) {
		this.files = files;
	}


	public Boolean getPub() {
		return pub;
	}


	public void setPub(Boolean pub) {
		this.pub = pub;
	}


	@Override
	public String toString() {
		return "BoardEntity [id=" + id + ", title=" + title + ", writer_id=" + writer_id + ", regdate=" + regdate
				+ ", content=" + content + ", hit=" + hit + ", files=" + files + ", pub=" + pub + "]";
	}
	
	

	
	
	
}
