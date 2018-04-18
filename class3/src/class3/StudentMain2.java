package class3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class StudentMain2 {
	public static void main(String[] args) {
		Student2 st1=new Student2();
		Student2 st2=new Student2();
		Student2 st3=new Student2();
		
		st1.setName("ashik");
		st1.setId(1001);
		st1.setSubject("Math");
		
		st2.setName("freak");
		st2.setId(1002);
		st2.setSubject("Psychology");
		
		st3.setName("demantor");
		st3.setId(1003);
		st3.setSubject("Dark Arts");
		
		List<Student2> sList=new ArrayList<Student2>();
		sList.add(st1);
		sList.add(st2);
		sList.add(st3);
		Collections.sort(sList);
		for(Student2 student : sList){
			System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getSubject());
		}
		
	}
}
