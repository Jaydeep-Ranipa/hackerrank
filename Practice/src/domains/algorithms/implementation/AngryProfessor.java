/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class AngryProfessor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		boolean canceled[] = new boolean[t];
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int a[] = new int[n];
			int attendeeCount = 0;
			for (int a_i = 0; a_i < n; a_i++) {
				a[a_i] = in.nextInt();
				if (a[a_i] <= 0) {
					attendeeCount++;
				}
			}
			canceled[a0] = (attendeeCount < k) ? true : false;
		}

		for (int i = 0; i < t; i++) {
			if (canceled[i])
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		in.close();
	}

}
