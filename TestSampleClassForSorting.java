package naveed.practice.test;

import java.util.Arrays;

public class TestSampleClassForSorting {
	public static void main(String[] args) {

		SampleClassForSorting[] fruits = new SampleClassForSorting[4];

		SampleClassForSorting pineappale = new SampleClassForSorting(
				"Pineapple", "Pineapple description", 70);
		SampleClassForSorting apple = new SampleClassForSorting("Apple",
				"Apple description", 100);
		SampleClassForSorting orange = new SampleClassForSorting("Orange",
				"Orange description", 80);
		SampleClassForSorting banana = new SampleClassForSorting("Banana",
				"Banana description", 90);
		fruits[0] = pineappale;
		fruits[1] = apple;
		fruits[2] = orange;
		fruits[3] = banana;
		Arrays.sort(fruits);
		int i = 0;
		for (SampleClassForSorting temp : fruits) {
			System.out.println("fruits " + ++i + " : " + temp.getFruitName()
					+ ", Quantity : " + temp.getQuantity());
		}
	}

}
