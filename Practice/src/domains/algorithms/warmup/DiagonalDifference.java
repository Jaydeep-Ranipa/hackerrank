/**
 * 
 */
package domains.algorithms.warmup;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class DiagonalDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int sumPrimary = 0;
		int sumSecondary = 0;
		for (int a_i = 0; a_i < n; a_i++) {
			for (int a_j = 0; a_j < n; a_j++) {
				a[a_i][a_j] = in.nextInt();
				if (a_i == a_j)
					sumPrimary += a[a_i][a_j];
				if ((a_i + a_j) == n - 1)
					sumSecondary += a[a_i][a_j];
			}
		}
		System.out.println(Math.abs(sumPrimary - sumSecondary));
		in.close();
	}

}
