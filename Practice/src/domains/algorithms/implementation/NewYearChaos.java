package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class NewYearChaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int n = in.nextInt();
            int q[] = new int[n];
            for(int q_i=0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }
            // your code goes here
            
            int diff = 0;
            boolean chaos = false;
            for (int i = 0; i < q.length; i++) {
				int sticker = q[i];
				int position = i+1;
				
				System.out.println(sticker+"<"+position+">");
				
				if (sticker > position) {
					int d = sticker-position;
					if (d > 2) {
						System.out.println("sticker :"+sticker+" at position "+(i+1)+" is chaotic.");
						chaos = true;
						break;					
					} else {
						diff += d;
					}
				}
			}
            
            if (chaos) {
            	System.out.println("Too chaotic");
			} else {
				System.out.println(diff);
			}
        }
	}

}
