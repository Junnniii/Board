package jun.spring.prj.service;

import java.util.List;

import jun.spring.prj.dto.DeptDTO;

public interface DeptDaoService {
	List<DeptDTO> selelcAll();
	
	public void insert(DeptDTO deptDTO);
	
	public DeptDTO select(int deptno);
	
	public void update(DeptDTO deptDTO);
	
	public void delete(int deptno);
}
