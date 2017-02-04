/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Jaydeep Ranipa
 *
 */
public class ManasaStones2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for (; T >= 0; T--) {
			int n = input.nextInt();
			int a = input.nextInt();
			int b = input.nextInt();
			
			SortedSet<Integer> possibleValues = new TreeSet<Integer>();
			
			for (int i = 0; i < n; i++) {
				int result = (a*(n-1-i))+(b*i);
				possibleValues.add(result);
			}
			
			for (Integer result : possibleValues) {
				System.out.println(result+" ");
			}
			
			System.out.println();
		}
		input.close();
	}

}
