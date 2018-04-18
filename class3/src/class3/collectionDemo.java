package class3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionDemo {
	//int[] a = { 1, 2, 5, 6, 3, 4 };
	public static void main(String args []){
		List<String> list=new ArrayList<String>();
		list.add("xyz");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		list.add("eee");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		int pos=Collections.binarySearch(list,"ccc");
		if (pos >= 0) {
			System.out.println("found at" + pos + " position");
		} else {
			System.out.println("not found");
		}
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		Collections.reverse(list);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println("shuffled"+list);
		
		List<Book> list2=new ArrayList<Book>();
		Book book1=new Book();
		Book book2=new Book();
	}
	
	
}
class Book{
	
}
