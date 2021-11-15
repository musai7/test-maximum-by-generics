package com.bridgeit;

public class TestMaximum<T> {

	T variable1;
	T variable2;
	T variable3;

	public TestMaximum(T variable1, T variable2, T variable3) {
		super();
		this.variable1 = variable1;
		this.variable2 = variable2;
		this.variable3 = variable3;
	}

	@SuppressWarnings({ "hiding", "unchecked" })
	public <T extends Comparable<T>> void maximum() {

		int maxCheck = ((T) variable1).compareTo((T) variable2);
		if (maxCheck > 0) {
			maxCheck = ((T) variable1).compareTo((T) variable3);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + variable1);
			} else
				System.out.println("maximum of three integers is : " + variable3);

		} else if (maxCheck < 0) {
			maxCheck = ((T) variable2).compareTo((T) variable3);
			if (maxCheck > 0) {
				System.out.println("maximum of three integers is : " + variable2);
			} else
				System.out.println("maximum of three integers is : " + variable3);
		}
	}

	public static void main(String[] args) {

		new TestMaximum<>(20, 40, 60).maximum();
		new TestMaximum<>(81.81, 40.99, 60.55).maximum();
		new TestMaximum<>("Apple", "apple", "aPPle").maximum();
	}
}
