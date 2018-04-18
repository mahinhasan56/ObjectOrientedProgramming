package class3;

import java.util.Arrays;
import java.util.Comparator;

public class NameReverse implements Comparator<String> {

	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		
		return o2.compareTo(o1);
	}
	
}
class nameMain{
	public static void main(String [] args){
		String ar[]={"snape","remus","madEye"};
		Arrays.sort(ar);
		Arrays.sort(ar,new NameReverse());
		System.out.print(" REVERSE ORDER ");
		for(String str:ar){
			System.out.print(str+" ");
		}
	}
}
