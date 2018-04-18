package class3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;
//in hashMap unique key is needed but can hold duplicate value
//hash table can not hold  null values or keys
public class hashMapDemo {
	public static void main(String [] args){
		HashMap<Integer,String> demo=new HashMap<Integer,String>();
		//Hashtable<Integer,String> demo=new Hashtable<Integer,String>();
		
		demo.put(1001,"Telot");
		demo.put(1002,"Ashik");
		demo.put(1003,"Utshab");
		demo.put(1004,"Telot");
		demo.put(1003,"Telot");
		demo.put(1005,null);
		
		int key=1001;
		System.out.println(key+" is id of "+demo.get(key));
		System.out.println(demo);
		//key set will give all the keys
		Set<Integer> id=demo.keySet();
		for(Integer integer: id){
			System.out.println(integer+" -> " +demo.get(integer));
		}
		
	}
}
