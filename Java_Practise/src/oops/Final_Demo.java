package oops;

import java.util.Random;

public class Final_Demo {

	static int i = 10;

	public static void main(String[] args) {

		final int k = 10;

		int arr[] = { 1, 2, 3, 4, 5 };

		arr[3] = 1;

		int arr2[] = { 5, 4, 3, 2, 1 };

		arr = arr2;

		for (int i = 0; i < 5; i++) {
			 System.out.println(arr[i]);
		}

	}

}
