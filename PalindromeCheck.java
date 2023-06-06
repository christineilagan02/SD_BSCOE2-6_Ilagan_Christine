// 5. Palindrome Check:
// A palindrome is a word, phrase, number, or other sequence of characters that reads the same backward as forward.

public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        boolean isPalindrome = original.equalsIgnoreCase(reversed);

        if (isPalindrome) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}
