/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class Encryption {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        String s = input.next();
        input.close();
        
        StringBuilder res = new StringBuilder("");
        
        int len = s.length();
        double sqrt = Math.sqrt(len); 
        
        // Number of rows
        int r = (int) Math.floor(sqrt);
        // Number of columns
        int c = (int) Math.ceil(sqrt);
        
        if (r*c < len) {
			r++;
		}
        
//        System.out.println("r=" +r+"c=" +c+"\n");
        
        int iR = 0, iC = 0;
        boolean space = false;
        for (int i = 0; i < r*c; i++) {
        	space = false;
//        	System.out.println("iR="+iR+" iC="+iC);
			int loc = iR*c + iC;
//			System.out.println("loc="+loc);
			
			if (loc < len) {
				res.append(s.charAt(loc)+"");
			} else {
				res.append(" ");
				space = true;
			}
			
			if (iR == (r-1)) {
//				System.out.println("iR="+iR+" iC="+iC);
				if (!space) {
					res.append(" ");
				}
				iR = 0;
				iC++;
			} else {
				iR++;
			}
		}
        String result = new String(res).trim();
        System.out.println(result);
	}

}
