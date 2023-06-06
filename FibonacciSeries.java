// 3. Fibonacci Series: (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
        int t1 = 0, t2 = 1;
        System.out.print("First " + (n + 1) + " terms: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
