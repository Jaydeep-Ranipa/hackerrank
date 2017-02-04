/**
 * 
 */
package domains.algorithms.implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class CutTheSticks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sticks[] = new int[n];
		for (int i = 0; i < n; i++) {
			sticks[i] = in.nextInt();
		}
		List<Integer> sticksCut = new ArrayList<Integer>();

		/*
		 * for (int i = 0; i < sticks.length; i++) { System.out.print(sticks[i]+
		 * " "); }
		 */

		Arrays.sort(sticks);

		/*
		 * for (int i = 0; i < sticks.length; i++) { System.out.print(sticks[i]+
		 * " "); }
		 */

		boolean cut = true;

		while (cut) {
			int cutCount = 0;
			int min = 0;

			for (int i = 0; i < sticks.length; i++) {
				if (sticks[i] != 0) {
					min = sticks[i];
					break;
				}
			}

			for (int i = 0; i < sticks.length; i++) {
				if (sticks[i] != 0) {
					cutCount++;
					sticks[i] -= min;
				}
			}

			/*
			 * for (int i = 0; i < sticks.length; i++) {
			 * System.out.print(sticks[i]+" "); } System.out.println();
			 */

			if (cutCount > 0) {
				cut = true;
				sticksCut.add(cutCount);
			} else {
				cut = false;
			}
		}

		for (Integer cutCount : sticksCut) {
			System.out.println(cutCount);
		}
		in.close();
	}

}
