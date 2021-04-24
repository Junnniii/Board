package jun.spring.prj.board1.service.jdbc;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.entity.BoardViewEntity;
import jun.spring.prj.board1.service.BoardService;

@Repository
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class JDBCBoardService implements BoardService {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<BoardViewEntity> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		QueryVO qvo = new QueryVO(field, query, page);
		return sqlSessionTemplate.selectList("getList",qvo);
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
