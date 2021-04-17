package jun.spring.prj.board1.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

public class BoardViewEntity extends BoardEntity{
	

	private int num;

	public BoardViewEntity(int id, String title, String writer_id, Date regdate, String content, int hit, String files,
			boolean pub, int num) {
		super(id, title, writer_id, regdate, content, hit, files, pub);
		this.num = num;
	}

	@Override
	public String toString() {
		return "BoardViewEntity [num=" + num + "]"+getId();
	}
	
	

}
