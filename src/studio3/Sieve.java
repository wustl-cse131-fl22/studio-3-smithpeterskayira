package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = in.nextInt();
		int[] numArray = new int[n];

		for (int i = 0; i <= n-1; i++) 
		{
			numArray[i] = i+2;
			if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % i == 0)
			{
				System.out.println(numArray[i]);
			}
		}
	}
}
