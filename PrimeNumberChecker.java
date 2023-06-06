// 2. Checking for a Prime Number:

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\u001B[34m"); 
        System.out.println("==== Prime Number Checker ====");
        System.out.print("\u001B[0m"); 

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println();
        if (isPrime) {
            System.out.print("\u001B[32m");
            System.out.println("Result: " + num + " is a prime number.");
        } else {
            System.out.print("\u001B[31m"); 
            System.out.println("Result: " + num + " is not a prime number.");
        }
        System.out.print("\u001B[0m"); 

        scanner.close();
    }
}
