package class3;

import java.util.HashMap;
import java.util.Map;

public class DeptOperation {
	Map <Integer,String> deptmap;
	public DeptOperation(){
		deptmap=new HashMap<Integer,String>();
		
	}
	public void addDepartment(Department dep){
		deptmap.put(dep.getId(),dep.getName());
	}
	public Map<Integer,String> getAllDepartment(){
		return deptmap;
	}
	public String  searchDepartment(Integer id){
		return deptmap.get(id);
	}
}
