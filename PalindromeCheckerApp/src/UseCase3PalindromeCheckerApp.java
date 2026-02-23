public class UseCase3PalindromeCheckerApp {
    public static void main(String[] args) {
        // Step 1: Initialize the string
        String original = "racecar";
        String reversed = "";

        // Step 2: Reverse the string using a for loop
        // We start at the last index (length - 1) and move to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
            // Note: Because Strings are immutable, a new string is created in each iteration
        }

        // Step 3: Compare original and reversed using .equals()
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}