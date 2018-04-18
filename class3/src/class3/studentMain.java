package class3;

public class studentMain {
	public static void main(String [] args) {
		studentOp student=new studentOp();
		student.addStudent("romy");
		student.addStudent("telot");
		student.addStudent("ashik");
		
		String name="xyz";
		if(student.checkStudent(name)){
			System.out.println("name found");
		}else{
			System.out.println("name not found");
		}
	}
}
