package jun.spring.prj.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Repository;

import jun.spring.prj.dto.DeptDTO;
import jun.spring.prj.service.DeptDaoService;

@Repository
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DeptDAO implements DeptDaoService{

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<DeptDTO> selelcAll() {
		return sqlSessionTemplate.selectList("selectAll");
	}

	@Override
	public void insert(DeptDTO deptDTO) {
		sqlSessionTemplate.insert("insert",deptDTO);
		
	}

	@Override
	public DeptDTO select(int deptno) {
		return sqlSessionTemplate.selectOne("select",deptno);
	}

	@Override
	public void update(DeptDTO deptDTO) {
		sqlSessionTemplate.update("update",deptDTO);
		
	}

	@Override
	public void delete(int deptno) {
		sqlSessionTemplate.delete("delete",deptno);
		
	}
	
}
