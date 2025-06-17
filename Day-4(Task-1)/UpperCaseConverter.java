import java.util.Scanner;

public class UpperCaseConverter {

    public static String convertToUpperUsingCharAt(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
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

        String upperByCharAt = convertToUpperUsingCharAt(text);
        String upperByBuiltIn = text.toUpperCase();

        System.out.println("\nConverted using charAt: " + upperByCharAt);
        System.out.println("Converted using toUpperCase(): " + upperByBuiltIn);

        boolean isEqual = compareStrings(upperByCharAt, upperByBuiltIn);
        System.out.println("Are both uppercase strings equal? " + isEqual);
    }
}
