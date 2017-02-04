/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class FindDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int count = 0;
		int ans[] = new int[t];
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			count = 0;
			int temp = n;
			while (temp != 0) {
				if ((temp % 10) == 0) {
					temp /= 10;
					continue;
				}
				if ((n % (temp % 10)) == 0) {
					count++;
				}
				temp /= 10;
			}
			ans[a0] = count;
		}

		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
		in.close();
	}

}
