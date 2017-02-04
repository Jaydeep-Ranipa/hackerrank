package domains.algorithms.warmup;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class CompareTriplets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();
		
		int alice=0, bob=0;
		
		if (a>d) {
			alice++;
		} else if (a<d) {
			bob++;
		}
		
		if (b>e) {
			alice++;
		} else if (b<e) {
			bob++;
		}
		
		if (c>f) {
			alice++;
		} else if (c<f) {
			bob++;
		}
		
		System.out.println(alice+" "+bob);
	}

}
