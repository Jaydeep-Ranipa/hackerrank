package domains.algorithms.warmup;

import java.util.Scanner;

public class VeryBigSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		long sum = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			sum += arr[arr_i];
		}
		System.out.println(sum);
		in.close();
	}

}
