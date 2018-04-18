package class3;

import java.util.Arrays;

public class arrayCopy {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 6, 3, 4 };
		int[] b = { 11, 22, 33, 44, 55, 66 };
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}

		int search = 5;
		int pos = Arrays.binarySearch(a, search);
		if (pos >= 0) {
			System.out.println(search + "found at" + pos + "position");
		} else {
			System.out.println(search + "not found");
		}
	}
}
