/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class CaesarCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        
        String res = "";
        for (int i = 0; i < n; i++) {
			char c = s.charAt(i);
			char newC;
			if (c>='a' && c<='z') {
				newC = (char) ((c-'a'+k < 26)?(c+k):('a'+(c-'a'+k)%26));
			} else if (c>='A' && c<='Z') {
				newC = (char) ((c-'A'+k < 26)?(c+k):('A'+(c-'A'+k)%26));
			} else {
				newC = c;
			}
			res += "" + newC;
		}
        System.out.println(res);
        in.close();
	}

}
