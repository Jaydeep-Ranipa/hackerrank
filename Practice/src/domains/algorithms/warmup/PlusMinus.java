/**
 * 
 */
package domains.algorithms.warmup;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class PlusMinus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		float fracPosi = 0;
		float fracNega = 0;
		float fracZero = 0;
		for (int arr_i = 0; arr_i < n; arr_i++) {
			arr[arr_i] = in.nextInt();
			if (arr[arr_i] > 0) {
				fracPosi++;
			}
			if (arr[arr_i] < 0) {
				fracNega++;
			}
			if (arr[arr_i] == 0) {
				fracZero++;
			}
		}
		System.out.println(fracPosi / n);
		System.out.println(fracNega / n);
		System.out.println(fracZero / n);
		in.close();
	}

}
