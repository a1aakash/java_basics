package day2java;

public class day2457 {

	public static void main(String[] args) { 
		for (int k = 4; k < 15; k++)
		{
		// Odd numbers are skipped
		if (k%2 != 0)
		continue;
		// Even numbers are printed
		System.out.print(k + " ");
		}
	}
}

