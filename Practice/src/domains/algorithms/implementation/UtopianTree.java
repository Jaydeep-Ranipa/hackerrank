/**
 * 
 */
package domains.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class UtopianTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<Integer> heights = new ArrayList<Integer>();

		for (int i = 0; i < t; i++) {
			int n = in.nextInt();

			int h = 1;
			for (int j = 1; j <= n; j++) {
				if (j % 2 == 0) {
					h++;
				} else {
					h *= 2;
				}
			}
			heights.add(h);
		}

		for (Integer height : heights) {
			System.out.println(height);
		}
		in.close();
	}

}
