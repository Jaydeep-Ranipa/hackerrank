/**
 * 
 */
package domains.algorithms.warmup;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class SavePrisoner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		while (t-- > 0) {
			// TODO: for each test case
			
			/** Number of prisoners */
			int n = input.nextInt();
			/** Number of sweets */
			int m = input.nextInt();
			/** Starting Prisoner */
			int s = input.nextInt();
			
			int warn = m % n + (s-1);
			
			if (warn > n) {
				warn %= n;
			}
			
			if (warn == 0) {
				warn = n;
			}
			
			System.out.println(warn);
		}
	}

}
// 	10,14,21,24,26,35,37,39,47,48,50,54,55,58,68,73,76,81,84,86,87,95