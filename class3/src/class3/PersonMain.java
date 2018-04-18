package class3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class personSortBySalary implements Comparator<Person>{

	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		Float salary1=o1.getSalary();
		Float salary2=o2.getSalary();
		if(salary1==null)
			System.out.println("salary1 is null");
		
		if(salary2==null)
			System.out.println("salary2 is null");
		
		return salary1.compareTo(salary2);
		
	}
	
}
public class PersonMain {
	void personInfo(List<Person> list1){
		System.out.println("id\tname\tsalary");
		for(Person person:list1){
			System.out.println(person.getId()+"\t"+person.getName()+"\t"+person.getSalary());
		}
	}
	public static void main(String [] args){
		Person person1=new Person();
		Person person2=new Person();
		Person person3=new Person();
		
		person1.setId(1);
		person1.setSalary( 10111f);
		person1.setName("a");
		
		person2.setId(2);
		person2.setSalary(10222f);
		person2.setName("b");
		
		person3.setId(3);
		person3.setSalary( 10333f);
		person3.setName("c");
		
		List<Person> list=new ArrayList<Person>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		Collections.sort(list,new personSortBySalary());
		PersonMain perMain=new PersonMain();
		perMain.personInfo(list);
		
		
	}
}
