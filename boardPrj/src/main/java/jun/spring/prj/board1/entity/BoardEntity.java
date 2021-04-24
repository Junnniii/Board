package jun.spring.prj.board1.entity;

import java.sql.Date;

public class BoardEntity {
	
	private int id;
	private String title;
	private String writer_id;
	private Date regdate;
	private String content;
	private int hit;
	private String files;
	private boolean pub;
	
	
	public BoardEntity(int id, String title, String writer_id, String content,Date regdate,  int hit, String files,
			boolean pub) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getFiles() {
		return files;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	public boolean isPub() {
		return pub;
	}
	public void setPub(boolean pub) {
		this.pub = pub;
	}
	@Override
	public String toString() {
		return "BoardEntity [id=" + id + ", title=" + title + ", writer_id=" + writer_id + ", regdate=" + regdate
				+ ", content=" + content + ", hit=" + hit + ", files=" + files + ", pub=" + pub + "]";
	}
	
	
}
