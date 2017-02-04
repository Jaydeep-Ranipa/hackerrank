/**
 * 
 */
package domains.algorithms.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class ChocolateFeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<Integer> chocos = new ArrayList<Integer>();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int c = in.nextInt();
			int m = in.nextInt();

			int totalChoco = 0;

			int chocoMoney = n / c;
			totalChoco += chocoMoney;
			int chocoWrap = 0;

			int nWrap = chocoMoney;

			while (nWrap >= m) {
				chocoWrap = nWrap / m;
				totalChoco += chocoWrap;
				nWrap = nWrap - (m * chocoWrap) + chocoWrap;
			}

			chocos.add(totalChoco);
		}

		for (Integer choco : chocos) {
			System.out.println(choco);
		}
		in.close();
	}

}
