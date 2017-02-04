package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class DivisibleSumPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int k = input.nextInt();
		
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = input.nextInt();
		}
		
		int dspc = getDivisibleSumPairsCount(a,k);
		
		System.out.println(dspc);
	}

	private static int getDivisibleSumPairsCount(int[] a, int k) {
		// TODO Auto-generated method stub
		int dspc = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if ( (a[i] + a[j])%k == 0 ) {
					dspc++;
				}
			}
		}
		return dspc;
	}

}
