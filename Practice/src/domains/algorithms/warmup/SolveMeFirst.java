package domains.algorithms.warmup;

import java.util.Scanner;

public class SolveMeFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
		in.close();
	}

	static int solveMeFirst(int a, int b) {
		// Hint: Type return a+b; below
		return a + b;
	}
}
