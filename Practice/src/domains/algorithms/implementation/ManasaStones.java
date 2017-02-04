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
public class ManasaStones {

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

			int stoneNumber = 0;

			int combCount = (int) Math.pow(2, n - 1);
			
			SortedSet<Integer> possibleValues = new TreeSet<Integer>();

			for (int i = 0; i < combCount; i++) {

				String binaryDiff = getBinaryString(i, n-1).toString();
//				System.out.println("binaryDiff: "+binaryDiff);
				
				for (int j = 0; j < n-1; j++) {
					if (binaryDiff.charAt(j) == '0') {
						stoneNumber += a;
					} else {
						stoneNumber += b;
					}
				}

				possibleValues.add(stoneNumber);
				stoneNumber = 0;
			}
			
			for (Integer value : possibleValues) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		input.close();
	}

	private static StringBuilder getBinaryString(int i, int length) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder(Integer.toBinaryString(i));
		StringBuilder zeroes = new StringBuilder("");
		for (int j = 0; j < length - s.length(); j++) {
			zeroes.append("0");
		}
		zeroes.append(s);
		return zeroes;
	}

}