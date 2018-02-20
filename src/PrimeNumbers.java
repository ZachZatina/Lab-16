import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int userNum = 0;
		String cont = "y";

		System.out.println("Lets locate some primes!");
		System.out.println("");
		System.out.println("This application will find you any prime, in order, from first prime number on.");

		while (cont.equalsIgnoreCase("Y")) {
			System.out.print("Which prime number are you looking for?: ");
			userNum = scnr.nextInt();

			System.out.println("");
			System.out.println("The number " + userNum + " prime is " + getPrime(userNum) + ".");

			scnr.nextLine();

			System.out.println("");
			System.out.print("Do you want to find another prime number? (y/n): ");
			cont = scnr.nextLine();
		}

		scnr.close();

	}

	public static int getPrime(int num) {
		int prime = 0;
		int i = 0;
		int j = 0;
		
			while (j <= num) {
				++i;
				if (isPrime(i)) {
					prime = i;
					++j;
				}
			}
		
		return prime;
	}
	
	public static boolean isPrime(int val) {
		if (val == 2) {
			return true;
		}

		for (int i = 2; i < val; ++i) {
			if (val % i == 0) {
				return false;
			}
		}
		return true;

	}

}
