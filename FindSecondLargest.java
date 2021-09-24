package week3.day2;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {

		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> listInt = new ArrayList<Integer>();
		for (int arrData : data) {
			listInt.add(arrData);
		}
		System.out.println("Before Sorting: " + listInt + "\n");
		Collections.sort(listInt);
		System.out.println("After sorting: " + listInt + "\n");
		int index = listInt.size() - 2;
		System.out.println("Second largest number is: " + listInt.get(index));

	}

}
