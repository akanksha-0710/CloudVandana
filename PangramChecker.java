public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace this with your input string
        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
        // Create an array to track the occurrence of each letter from 'a' to 'z'
        boolean[] alphabet = new boolean[26];

        // Convert the input string to lowercase for case-insensitive checking
        str = str.toLowerCase();

        // Iterate through the characters of the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // If the character is a lowercase letter, mark it as seen in the array
                alphabet[c - 'a'] = true;
            }
        }

        // Check if all alphabet letters have been seen (marked as true)
        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // If all letters are seen, it's a pangram
    }
}
