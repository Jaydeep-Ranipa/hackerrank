package domains.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Array1D {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();

		ArrayList<String> result = new ArrayList<String>();

		for (int t_i = 0; t_i < t; t_i++) {
			/** for each test case */
			int n = input.nextInt();
			int m = input.nextInt();
			int[] arr = new int[n];
			
			int maxConOneCount = 0;
			int conOneCount = 0;
			
			for (int i = 0; i < arr.length; i++) {
				
				/** Taking array input*/
				arr[i] = input.nextInt();
				
				/** if this is not the first element and a consecutive 1 */
				if ((i!=0) && (arr[i] == 1) 
					&& (arr[i]==arr[i-1])) {
					conOneCount++;
//					System.out.println("conOneCount++ at i="+i);
					if (conOneCount > maxConOneCount) {
						maxConOneCount = conOneCount;
//						System.out.println("maxconOneCount changed at i="+i);
					}
				} else if(arr[i]==1 && arr[i-1] == 0) {
					conOneCount=1;
//					System.out.println("conOneCount 1 at i="+i);
					if (conOneCount > maxConOneCount) {
						maxConOneCount = conOneCount;
//						System.out.println("maxconOneCount changed at i="+i);
					}
				} else {
					conOneCount = 0;
				}
			
			}
			
//			System.out.println("maxConOneCount: "+maxConOneCount);
			
			if (maxConOneCount >= m) {
//				System.out.println("NO");
				result.add("NO");
//				continue;				
			} else {
//				System.out.println("YES");
				result.add("YES");
//				continue;
			}
		}
		
		for (String r : result) {
			System.out.println(r);
		}		
		input.close();
	}
}
