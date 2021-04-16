package jun.spring.prj.board1.service.jdbc;

import java.sql.SQLException;
import java.util.List;

import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.service.BoardService;

public class JDBCBoardService implements BoardService {

	@Override
	public List<BoardEntity> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		
		return null;
	}

	@Override
	public BoardEntity read(int id) throws ClassNotFoundException, SQLException {
		
		return null;
	}

	@Override
	public int getCount() throws ClassNotFoundException, SQLException {
		
		return 0;
	}

	@Override
	public int insert(BoardEntity boardEntity) throws ClassNotFoundException, SQLException {
	
		return 0;
	}

	@Override
	public int update(BoardEntity boardEntity) throws ClassNotFoundException, SQLException {
	
		return 0;
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
	
		return 0;
	}

}
