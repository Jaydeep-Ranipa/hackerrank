/**
 * 
 */
package domains.algorithms.implementation;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 * 
 */
public class CavityMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String grid[] = new String[n];
		for (int grid_i = 0; grid_i < n; grid_i++) {
			grid[grid_i] = in.next();			
		}
		in.close();
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length(); j++) {
				int centerDepth = (int) grid[i].charAt(j);
				
				if (i!=0 && j!=0 && i!=grid.length-1 && j!=grid[i].length()-1) {
					
					int up = (int) grid[i-1].charAt(j);
					int down = (int) grid[i+1].charAt(j);
					int left = (int) grid[i].charAt(j-1);
					int right = (int) grid[i].charAt(j+1);
					
					if ((centerDepth>up)
						&& (centerDepth>down)
						&& (centerDepth>left)
						&& (centerDepth>right)) {
						System.out.print('X');
					} else {
						System.out.print(grid[i].charAt(j));
					}
				} else {
					System.out.print(grid[i].charAt(j));
				}
			}
			System.out.println();
		}
	}

}
