package jun.spring.prj.board1.entity;

import java.sql.Timestamp;
// 게시글 목록용 VO
public class BoardViewEntity extends BoardEntity{
	

	private int num;



	public BoardViewEntity(int num,int id, String title, String writer_id, String content, Timestamp regdate, int hit, String files,
			boolean pub ) {
		super(id, title, writer_id, content, regdate, hit, files, pub);
		this.num = num;
	}



	@Override
	public String toString() {
		return "BoardViewEntity [num=" + num + "]"+super.toString();
	}
	
	

}
