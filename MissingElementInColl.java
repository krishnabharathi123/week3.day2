package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInColl {

	public static void main(String[] args) {
		int[] arr = { 11, 12, 13, 14, 17, 16, 18 };
		int j = 0;
		List<Integer> listInt = new ArrayList<Integer>();
		for (int arrData : arr) {
			listInt.add(arrData);
		}
		Collections.sort(listInt);
		for (int i = listInt.get(0); i <= listInt.get(0)+listInt.size(); i++) {
			if (i != listInt.get(j)) {
				System.out.println("Missing number in the list is: "+i);
				break;
			};
			j++;
		}

	}

}
