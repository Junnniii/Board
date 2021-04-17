package jun.spring.prj.board1.service;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSessionException;

import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.entity.BoardViewEntity;

public interface BoardService {
	List<BoardViewEntity> getList(int page, String field, String query) throws ClassNotFoundException, SQLException;
	
	BoardEntity read(int id) throws ClassNotFoundException, SQLException;
	
	int getCount() throws ClassNotFoundException, SQLException;
	
	int insert(BoardEntity boardEntity) throws ClassNotFoundException, SQLException;
	
	int update(BoardEntity boardEntity) throws ClassNotFoundException, SQLException;
	
	int delete(int id) throws ClassNotFoundException, SQLException;
}
