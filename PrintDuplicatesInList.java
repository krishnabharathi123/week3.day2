package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInList {

	public static void main(String[] args) {

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		List<Integer> arrInt = new ArrayList<Integer>();
		Set<Integer> dupSet = new LinkedHashSet<Integer>(arrInt);
		for (int i : arr) {
			arrInt.add(i);
		}
		System.out.println("*** Duplicate numbers in the list are ***");
		for (int i = 0; i < arrInt.size(); i++) {
			boolean addStatus=dupSet.add(arrInt.get(i));
			if(addStatus!=true) {
				System.out.println(arrInt.get(i));
			}
		}

	}
}
