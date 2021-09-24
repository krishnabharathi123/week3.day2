package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {

		/*
		 * int[] arr1={3,2,11,4,6,7}; int[] arr2={1,2,8,4,9,7}; Arrays.asList(arr1);
		 * Arrays.asList(arr2);
		 */
		List<Integer> arr1List=new ArrayList<Integer>();
		arr1List.add(3);
		arr1List.add(2);
		arr1List.add(11);
		arr1List.add(4);
		arr1List.add(6);
		arr1List.add(7);
		
		List<Integer> arr2List=new ArrayList<Integer>();
		arr2List.add(11);
		arr2List.add(2);
		arr2List.add(8);
		arr2List.add(4);
		arr2List.add(9);
		arr2List.add(7);
		
		arr1List.retainAll(arr2List);
		System.out.println("Common values in lists are: "+arr1List);
		
	}

}
