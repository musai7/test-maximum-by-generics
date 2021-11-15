package com.bridgeit;

public class TestMaximum {

	public static <T extends Comparable<T>> void maximum(T[] arr) {

		int maxCheck = arr[0].compareTo(arr[1]);
		if (maxCheck > 0) {
			maxCheck = arr[0].compareTo(arr[2]);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + arr[0]);
			} else
				System.out.println("maximum of three integers is : " + arr[2]);

		} else if (maxCheck < 0) {
			maxCheck = arr[1].compareTo(arr[2]);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + arr[1]);
			} else
				System.out.println("maximum of three integers is : " + arr[2]);
		}
	}

	public static void main(String[] args) {

		Integer intArray[] = { 20, 22, 21 };
		Double doubleArray[] = { 26.26, 22.25, 28.23 };
		String stringArray[] = { "Apple", "Peach", "Banana" };
		maximum(intArray);
		maximum(doubleArray);
		maximum(stringArray);
	}
}
