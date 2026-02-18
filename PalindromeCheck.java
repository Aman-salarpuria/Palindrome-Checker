public class PalindromeCheck {

    public static void main(String[] args) {

        // Program starts

        String str = "madam";   // Hardcoded string
        String reversed = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Check if palindrome
        if (str.equals(reversed)) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }

        // Program exits
    }
}
