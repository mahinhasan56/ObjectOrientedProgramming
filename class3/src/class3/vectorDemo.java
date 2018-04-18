package class3;

import java.util.Vector;

public class vectorDemo {
	public static void main(String args[]) {
		Vector <Integer> vect=new Vector<Integer>();
		System.out.println("cap "+vect.capacity());
		for (int i = 0; i <= 11; i++) {
			System.out.println(vect.capacity()+"\t"+vect.size());
			vect.add(i);
		}
		
	}
}
