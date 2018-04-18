package class3;

import java.util.Map;

public class DepartmentMain {
	static DeptOperation depOp;
	public static void main(String [] args){
		Department d1=new Department();
		Department d2=new Department();
		Department d3=new Department();
		d1.setId(1001);
		d1.setName("CSE");
		d2.setId(1002);
		d2.setName("BBA");
		d3.setId(1003);
		d3.setName("ECONOMICS");
		
		
		depOp=new DeptOperation();
		depOp.addDepartment(d1);
		depOp.addDepartment(d2);
		depOp.addDepartment(d3);
		Map<Integer,String> dep=depOp.getAllDepartment();
		
		for(Integer k:dep.keySet()){
			System.out.println(k+"\t"+dep.get(k));
		}
		
			//DeptOperation operation=new DeptOperation();
			int key=1001;
			System.out.println("Searh Department with id "+key);
			String nm=depOp.searchDepartment(key);
			if(nm==null){
			System.out.println("No dept with id "+key);
			}else{
			System.out.println("dept found with id "+key+ " the name is "+dep.get(key));
			}
			

			
				
	}
}
