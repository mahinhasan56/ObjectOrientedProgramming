package class3;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
//set is unordered where as list is ordered..set has nop index,no duplicate..list has index,has get method, can have duplicate
public class SetDemo {
	public static void main(String []args){
		Set<String> set=new HashSet<String>();
		//Set<String> set=new TreeSet<String>();//sorted
		//Set<String> set=new LinkedHashSet<String>();//orderd
		set.add("apple");
		set.add("motorolla");
		set.add("lg");
		set.add("google");
		set.add("google");
		System.out.println(set);
		for(String string:set){
			System.out.println("-> "+string);
		}
	}
}
