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
public class SherlockSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		List<Integer> squareCounts = new ArrayList<Integer>();
		for (int i = 0; i < t; i++) {
			int start = input.nextInt();
			int end = input.nextInt();
			int sqCount = 0;
			for (int j = (int) Math.sqrt(start); j <= (int) Math.sqrt(end); j++) {				
				if (j*j >= start
						&& j*j <= end ) {
					sqCount++;
				}
			}
			squareCounts.add(sqCount);
		}
		
		for (Integer sq : squareCounts) {
			System.out.println(sq);
		}
		input.close();
	}

}
