package class3;

import java.util.ArrayList;

public class studentOp {
	static ArrayList list=new ArrayList();
	public void addStudent(String name){
		list.add(name);
	}
	public boolean checkStudent(String name){
		boolean status =false;
		if(list.contains(name)){
			status=true;
		}
		return status;
	}
}
