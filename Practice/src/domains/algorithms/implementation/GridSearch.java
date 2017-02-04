/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class GridSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		boolean[] res = new boolean[t];
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}
			boolean found = false;
			for (int i = 0; i < G.length-P.length; i++) {
				int pIndex = 0;
				int startIndex = G[i].indexOf(P[pIndex++]);
				if (startIndex != -1) {
					boolean complete = true;
					for (int j = i+1; j < r-1; j++) {
						String gridSubString = G[j].substring(startIndex, startIndex+c-1);
						if (!gridSubString.equals(P[pIndex++])) {
							complete = false;
							break;
						}
					}
					if (complete) {
						found = true;
						break;
					}
				}
			}
			
			if (found) {
				res[a0] = true;
			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]?"YES":"NO");
		}
		in.close();
	}

}
