package oops;

public class BigO {

	static String OddorEven(int n) {
		return n % 2 == 1 ? "Odd" : "Even";
	}

	public static int linearSearch(int[] arr, int key) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			count++;

			if (arr[i] == key) {
				System.out.println("Count: " + count);
				return i;
			}
		}
		return -1;
	}

	public static void Search(int[][] arr, int key) {

		int count = 0;

		for (int i = 0; i < 2; i++) {
			count++;

			for (int j = 0; j < 2; j++) {

				count++;

				if (arr[i][j] == key) {
					System.out.println(count);
					System.out.println("arr[" + i + "][" + j + "] = " + arr[i][j]);
				}
			}
		}
	}

	public static int fibonacci(int number) {

		if (number <= 1) {
			return number;
		} else {
			return fibonacci(number - 1) + fibonacci(number - 2);
		}
	}

	static int c = 0;

	public static int nFacRuntimeFunc(int n) {

		for (int i = 0; i < n; i++) {
			c++;
			nFacRuntimeFunc(n - 1);
		}

		return c;
	}

	public static void main(String[] args) {

//		 System.out.println(OddorEven(2));

//		int[] a1 = { 10, 20, 30, 50, 70, 90 };
//		int key = 90;
//		System.out.println(key + " is found at index: " + linearSearch(a1, key));

//		int[][] arr = { { 1, 2 }, { 3, 4 } };
//		int key = 4;
//		Search(arr, key);

//		System.out.println(fibonacci(5));

//		System.out.println(nFacRuntimeFunc(4));

	}

}
