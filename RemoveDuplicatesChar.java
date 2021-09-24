package week3.day2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesChar {

	public static void main(String[] args) {
		String str = "PayPal India";
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			// System.out.println(ch[i] + " is " + charSet.add(ch[i]));

			/*
			 * if (!charSet.add(ch[i])) { dupCharSet.add(ch[i]); }
			 */
			boolean addStatus = charSet.add(ch[i]);
			if (addStatus == false) {
				dupCharSet.add(ch[i]);
			}

		}
		System.out.println("charSet is: " + charSet);
		System.out.println("duplicatecharacters are: " + dupCharSet);
		charSet.removeAll(dupCharSet);
		/*
		 * for (int j = 0; j < charSet.size(); j++) { System.out.println(charSet); }
		 */
		System.out.println("***Removed Duplicate Values****");
		for (Character character : charSet) {
			if (character != ' ') {
				System.out.println(character);
			}
		}
	}

}
