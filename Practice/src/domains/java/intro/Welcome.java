/**
 * 
 */
package domains.java.intro;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Jaydeep Ranipa
 *
 */
public class Welcome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = { 0, 1, 2, 3, 4 };
		try {
			System.out.println("x[6]:" + x[6]);
			System.out.println("x[3]:" + x[3]);
		} catch (IndexOutOfBoundsException ie) {
			System.out.println("Some kind of index out of bound!");
		} finally {
			System.out.println("finally must be executed");
		}
		System.out.println("x[0]:" + x[0]);

	}

}