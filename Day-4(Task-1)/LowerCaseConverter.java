import java.util.Scanner;

public class LowerCaseConverter {

    public static String convertToLowerUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the complete text: ");
        String text = scanner.nextLine();

        String lowerByCharAt = convertToLowerUsingCharAt(text);
        String lowerByBuiltIn = text.toLowerCase();

        System.out.println("\nConverted using charAt: " + lowerByCharAt);
        System.out.println("Converted using toLowerCase(): " + lowerByBuiltIn);

        boolean isEqual = compareStrings(lowerByCharAt, lowerByBuiltIn);
        System.out.println("Are both lowercase strings equal? " + isEqual);
    }
}
