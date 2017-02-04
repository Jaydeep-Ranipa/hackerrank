package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class JumpClouds {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		int[] cloud = new int[n];
		for (int i = 0; i < cloud.length; i++) {
			cloud[i] = input.nextInt();
		}
		
		int jc = getJumpCount(cloud);
		
		System.out.println(jc);
	}

	private static int getJumpCount(int[] cloud) {
		// TODO Auto-generated method stub
		int jc = 0;
		int position = 0;
		while (position < cloud.length-2) {
			if (cloud[position+2] == 0) {
				position += 2;
			} else {
				position++;
			}
			jc++;
		}
		if (position < cloud.length-1) {
            jc++;
        }
		return jc;
	}

}
