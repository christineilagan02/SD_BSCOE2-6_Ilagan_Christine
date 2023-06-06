// 5. Palindrome Check:
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward.

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\u001B[35m Enter a word: \u001B[0m");
        String original = scanner.nextLine();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        boolean isPalindrome = original.equalsIgnoreCase(reversed);

        System.out.println("\u001B[33m********************************************");
        System.out.println("*             PALINDROME CHECK             *");
        System.out.println("********************************************\u001B[0m");
        System.out.println();

        System.out.println("\u001B[36mOriginal word: \u001B[0m" + original);
        System.out.println("\u001B[36mReversed word: \u001B[0m" + reversed);

        if (isPalindrome) {
            System.out.println("\n\t\u001B[32m     It is a palindrome.\n\u001B[0m");
        } else {
            System.out.println("\n\t\u001B[31m  It is not a palindrome.\n\u001B[0m");
        }

        System.out.println("\u001B[33m********************************************\u001B[0m");

        scanner.close();
    }
}
