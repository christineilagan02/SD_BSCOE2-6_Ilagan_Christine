// 1. Finding the Maximum Value in an Array:

import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("\u001B[33m********************************************");
        System.out.println("*            Maximum Value Finder          *");
        System.out.println("********************************************\u001B[0m");
        System.out.println();

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println();
        System.out.println("\u001B[34mEnter the elements of the array:\u001B[0m");
        
        for (int i = 0; i < n; i++) {
            System.out.print("\u001B[36m>> \u001B[0m");
            numbers[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("\u001B[33m********************************************");
        System.out.println("*\u001B[0m Array: \u001B[35m" + arrayToString(numbers) + "\u001B[0m");
        System.out.println("\u001B[33m*\u001B[0m Maximum Value: \u001B[1m\u001B[32m" + findMaximum(numbers) + "\u001B[0m");
        System.out.println("\u001B[33m********************************************\u001B[0m");
        System.out.println();

        scanner.close();
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i != array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static int findMaximum(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}