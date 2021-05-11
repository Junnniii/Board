package jun.spring.prj.board1.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSessionException;

import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.entity.BoardViewEntity;

public interface BoardService {
//	글목록 불러오기
	List<BoardViewEntity> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
//	게시글 읽기
	BoardEntity getBoard(int id) throws ClassNotFoundException, SQLException;
	
//	총 필드 갯수 확인
	int countLines(String field, String query) throws ClassNotFoundException, SQLException;
	
//	게시글 작성
	int insert(BoardEntity boardEntity) throws ClassNotFoundException, SQLException;
	
//	게시글 수정
	int update(BoardEntity boardEntity) throws ClassNotFoundException, SQLException;
	
//	게시글 조회수  
	int countHit(int id) throws ClassNotFoundException, SQLException;
	
//	게시글 삭제
	int delete(int id) throws ClassNotFoundException, SQLException;

//	이전글 불러오기
	BoardEntity prevBoard(int id) throws ClassNotFoundException, SQLException;
	
//	다음글 불러오기
	BoardEntity nextBoard(int id) throws ClassNotFoundException, SQLException;
}
