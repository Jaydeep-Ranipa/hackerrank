 package domains.algorithms.implementation;

import java.util.Scanner;

public class SherlockBeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        int t = input.nextInt();
//        String result[] = new String[t];
        for(int i = 0; i < t; i++){
            long N = input.nextLong();
            
            long m = 0;	// number of 5's
            long n = 0;	// number of 3's
            
            boolean keyFound = false;
            
            for (n = 0; n <= N; n+=5) {
				m = N - n;				
				if (m%3 == 0) {
					keyFound = true;
//					System.out.println("-");
					break;
				}
			}
            
            if (!keyFound) {
//            	result[i] = "-1";
            	System.out.println(-1);
				continue;
			}
            
//            System.out.println("m: "+m+" n: "+n);
            
            StringBuilder decentNumber = new StringBuilder("");
            
            for (long j = 1; j <= m; j++) {
//            	decentNumber += "5";
            	decentNumber.append("5");
			}
            for (long j = m+1; j <= N; j++) {
            	decentNumber.append("3");
			}
            
            /*for (long j = N; j>0; j--) {
            	if (j > (N-m)) {
            		decentNumber += "5";
            		System.out.println(decentNumber);
				} else {
					decentNumber += "3";
					System.out.println(decentNumber);
				}				
			}*/
            
            /*long decentNumber = 0;
            for (int j = N; j >0; j--) {
            	if (j > (N-m)) {
            		decentNumber += Math.pow(10, j-1)*5;
            		System.out.println(decentNumber);
				} else {
					decentNumber += Math.pow(10, j-1)*3;
					System.out.println(decentNumber);
				}				
			}*/
            
            System.out.println(decentNumber);
//            result[i] = decentNumber;
        }
        
        /*for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}*/
        
        input.close();
	}

}
