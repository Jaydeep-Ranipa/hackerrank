package domains.algorithms.implementation;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Jaydeep Ranipa
 *
 */
public class EqualStacks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int n3 = input.nextInt();
		
		int[] s1 = new int[n1];
		int[] s2 = new int[n2];
		int[] s3 = new int[n3];
		
		int sum1 = 0, sum2 = 0, sum3 = 0;
		int i1 = 0, i2 = 0, i3 = 0;
		
		for (int i = 0; i < n1; i++) {
			s1[i] = input.nextInt(); 
			sum1 += s1[i];
		}
		
		for (int i = 0; i < n2; i++) {
			s2[i] = input.nextInt();
			sum2 += s2[i];
		}
		
		for (int i = 0; i < n3; i++) {
			s3[i] = input.nextInt();
			sum3+= s3[i];
		}
		while( !((sum1 == sum2)
			  && (sum2 == sum3)
			  && (sum3 == sum1)) ){
			
			if (getMax(sum1, sum2, sum3) == 1) {
				sum1 -= s1[i1];
				i1++;
			}
			
			if (getMax(sum1, sum2, sum3) == 2) {
				sum2 -= s2[i2];
				i2++;
			}
			
			if (getMax(sum1, sum2, sum3) == 3) {
				sum3 -= s3[i3];
				i3++;
			}
		}
		
		System.out.println(sum1);
	}
	
	public static byte getMax(int a, int b, int c) {
		if (Math.max(a, Math.max(b, c)) == a) {
			return 1;
		} else if (Math.max(b, Math.max(a, c)) == b) {
			return 2;
		} else {
			return 3;
		}
	}
}
