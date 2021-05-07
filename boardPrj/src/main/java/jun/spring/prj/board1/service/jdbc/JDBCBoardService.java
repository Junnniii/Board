package jun.spring.prj.board1.service.jdbc;

import java.sql.SQLException;
import java.util.List;


import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import jun.spring.prj.board1.entity.BoardEntity;
import jun.spring.prj.board1.entity.BoardViewEntity;
import jun.spring.prj.board1.entity.QueryVO;
import jun.spring.prj.board1.service.BoardService;

@Service
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class JDBCBoardService implements BoardService {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<BoardViewEntity> getList(int page, String field, String query) throws ClassNotFoundException, SQLException {
		QueryVO qvo = new QueryVO(field, query, page);
//		System.out.println(qvo.toString());
		return sqlSessionTemplate.selectList("getList",qvo);
	}

	
	@Override
	public BoardEntity getBoard(int id) throws ClassNotFoundException, SQLException {
		return sqlSessionTemplate.selectOne("getBoard",id);
	}
	
	@Override
	public int countLines(String field, String query) throws ClassNotFoundException, SQLException {
		QueryVO qvo = new QueryVO(field, query, 0);
		return sqlSessionTemplate.selectOne("countLines",qvo);
	}

	@Override
	public int countHit(int id) throws ClassNotFoundException, SQLException {
		return sqlSessionTemplate.update("countHit", id);
	}

	@Override
	public int insert(BoardEntity boardEntity) throws ClassNotFoundException, SQLException {
		System.out.println(boardEntity.toString());
		return sqlSessionTemplate.insert("regBoard",boardEntity);
		
	}

	@Override
	public int update(BoardEntity boardEntity) throws ClassNotFoundException, SQLException {
	
		return sqlSessionTemplate.update("updateBoard", boardEntity);
	}

	@Override
	public int delete(int id) throws ClassNotFoundException, SQLException {
	
		return sqlSessionTemplate.delete("deleteBoard",id); 
	}


	@Override
	public BoardEntity prevBoard(int id) throws ClassNotFoundException, SQLException {
		return sqlSessionTemplate.selectOne("prevBoard",id);
	}


	@Override
	public BoardEntity nextBoard(int id) throws ClassNotFoundException, SQLException {
		return sqlSessionTemplate.selectOne("nextBoard",id);
	}

	


}
