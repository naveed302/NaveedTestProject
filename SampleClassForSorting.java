package naveed.practice.test;

import java.util.Comparator;

public class SampleClassForSorting implements
		Comparable<SampleClassForSorting>, Comparator<SampleClassForSorting> {
	private String fruitName;
	private String fruitDescription;
	private int quantity;

	SampleClassForSorting(String fruitName, String fruitDescription,
			int quantity) {

		this.fruitName = fruitName;
		this.fruitDescription = fruitDescription;
		this.quantity = quantity;
	}
	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getFruitDescription() {
		return fruitDescription;
	}

	public void setFruitDescription(String fruitDescription) {
		this.fruitDescription = fruitDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public int compare(SampleClassForSorting fruit1,
			SampleClassForSorting fruit2) {

		String fruitName1 = fruit1.getFruitName().toUpperCase();
		String fruitName2 = fruit2.getFruitName().toUpperCase();

		// ascending order
		return fruitName1.compareTo(fruitName2);
		// descending order
		// return fruitName2.compareTo(fruitName1);

	}
	
	@Override
	public int compareTo(SampleClassForSorting fruit) {

		int compareQuantity = fruit.getQuantity();

		// ascending order
//		return this.quantity - compareQuantity;

		// descending order
		 return compareQuantity - this.quantity;
	}

}
