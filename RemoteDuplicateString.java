package week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import week1.day1.ConditionalStatements;

public class RemoteDuplicateString {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str=text.split(" ");
		List<String> strList=new ArrayList<String>();
		strList.addAll(Arrays.asList(str));
		System.out.println(strList);
		Set<String> strSet=new LinkedHashSet<String>(strList);
		System.out.println(strSet);
		ConditionalStatements cs=new ConditionalStatements();
	}

}
