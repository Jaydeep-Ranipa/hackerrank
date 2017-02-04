/**
 * 
 */
package domains.algorithms.warmup;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class StairCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		in.close();
	}

}
