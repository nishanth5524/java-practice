package Collection;

import java.util.Scanner;

public class DoubleHashing {

	static void printArray(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=-1)
			System.out.print(arr[i] + " ");
		}
	}

	static void hashing(int table[], int tsize, int arr[], int N) {

		for (int i = 0; i < N; i++) {

			int hv = arr[i] % tsize;

			if (table[hv] == -1)
				table[hv] = arr[i];
			else {

				for (int j = 0; j < tsize; j++) {

					int t = (hv+(i*hv)) % tsize;
					if (table[t] == -1) {

						table[t] = arr[i];
						break;
					}
				}
			}
		}

		printArray(table);
	}
	
	static void get(int table[], int tsize, int n) {

		for (int i = 0; i < tsize; i++) {
			int t = (n+(i*n)) % tsize;

			if (table[t] == n) {
				System.out.println("found @" + t);
				break;
			} 
		}
	}

	public static void main(String args[]) {
		int arr[] = {7,36,18,62};
		int N = 4;

		int L = 11;
		int hash_table[] = new int[L];

		for (int i = 0; i < L; i++) {
			hash_table[i] = -1;
		}

		hashing(hash_table, L, arr, N);
		
		System.out.println("\nEnter value to search");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		get(hash_table, L, n);
	}
}

