// 3. Fibonacci Series: (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number o terms: ");
        int n = scanner.nextInt();
        int t1 = 0, t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }

        scanner.close();
    }
}
