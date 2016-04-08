package naveed.practice.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaSorting {

	public static void main(String[] args) {
		String[] fruits = new String[] { "Pineapple", "Apple", "Orange",
				"Banana" };
		Arrays.sort(fruits);
		System.out.println(Arrays.toString(fruits));
		List<String> fruits1 = new ArrayList<String>();
		fruits1.add("Pineapple");
		fruits1.add("Apple");
		fruits1.add("Orange");
		fruits1.add("Banana");
		Collections.sort(fruits1);
		System.out.println(fruits1);

	}

}
