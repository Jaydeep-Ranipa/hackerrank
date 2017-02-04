/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class Kangaroo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x1 = input.nextInt();
		int v1 = input.nextInt();
		int x2 = input.nextInt();
		int v2 = input.nextInt();

		if (v1 > v2) {
			int temp = v1;
			v1 = v2;
			v2 = temp;
			
			temp = x1;
			x1 = x2;
			x2 = temp;
		}
		
		// 1st is slower and 2nd is faster
		
		if (x1 <= x2) {
			System.out.println("NO");
			System.exit(0);
		}
		int a = x1, b = x2;
		while (a > b) {
			a += v1;
			b += v2;
			if (a == b) {
				System.out.println("YES");
				System.exit(0);
			}
		}
		System.out.println("NO");
	}
}
