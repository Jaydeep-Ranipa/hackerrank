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
public class ServiceLane {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		int width[] = new int[n];
		for (int width_i = 0; width_i < n; width_i++) {
			width[width_i] = in.nextInt();
		}
		List<Integer> vehicles = new ArrayList<Integer>();
		for (int a0 = 0; a0 < t; a0++) {
			int i = in.nextInt();
			int j = in.nextInt();
			int minVehicle = 3;
			for (int k = i; k <= j; k++) {
				if (width[k] == 1) {
					minVehicle = 1;
					break;
				}
				if (minVehicle > width[k]) {
					minVehicle = width[k];
				}
			}
			vehicles.add(minVehicle);
		}

		for (Integer vehicle : vehicles) {
			System.out.println(vehicle);
		}
		in.close();
	}

}
