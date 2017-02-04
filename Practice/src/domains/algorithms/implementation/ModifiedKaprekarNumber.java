/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class ModifiedKaprekarNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		long p = input.nextInt();
		long q = input.nextInt();
		input.close();
		
		boolean found = false;
		
		for (long i = p; i <= q; i++) {
			long sq = i*i;
			String strsq = Long.toString(sq);
			
			if (sq == 1) {
				System.out.print(1+" ");
				continue;
			}
			
			if (sq == 4 || sq == 9) {
				continue;
			}
			/*
			System.out.println("left: "+strsq.substring(0, strsq.length()/2));
			System.out.println("right: "+strsq.substring(strsq.length()/2));
			*/
			
			long l = Long.parseLong(strsq.substring(0, strsq.length()/2));
			long r = Long.parseLong(strsq.substring(strsq.length()/2));
			
//			System.out.println("l="+l+" r="+r);
			
			if ((l+r) == i) {
				found = true;
				System.out.print(i+" ");
			}
		}
		
		if (!found) {
			System.out.println("INVALID RANGE");
		}
	}

}
