/**
 * 
 */
package domains.algorithms.warmup;

import java.util.Scanner;

/**
 * @author Jaydeep Ranipa
 *
 */
public class TimeConversion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String time = in.next();

		int hour = Integer.parseInt(time.substring(0, 2));
		String rem = time.substring(2, 8);

		// System.out.println("rem:" +rem);
		// System.out.println("hour:" +hour);

		String res24 = "";
		if (time.charAt(8) == 'P') {
			if (hour + 12 >= 24)
				res24 = hour + "" + rem;
			else
				res24 = (hour + 12) + rem;
		} else if (time.charAt(8) == 'A' && hour == 12) {
			res24 = "00" + rem;
		} else {
			res24 = String.format("%02d", hour) + "" + rem;
		}

		System.out.println(res24);
		/**/
		in.close();
	}

}
