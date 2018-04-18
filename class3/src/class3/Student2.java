package class3;

public class Student2 implements Comparable<Student2>{
		private String name;
		private int id;
		private String subject;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public int compareTo(Student2 o) {
			// TODO Auto-generated method stub
			if(this.id>o.id){
				return 1;
			}else if(this.id==o.id){
				return 0;
			}else{
				return -1;
			}
			
		}
}
