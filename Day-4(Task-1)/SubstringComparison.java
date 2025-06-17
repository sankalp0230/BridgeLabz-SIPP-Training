import java.util.Scanner;

public class SubstringComparison {

    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result += text.charAt(i);
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

        System.out.print("Enter the text: ");
        String text = scanner.next();

        System.out.print("Enter the start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end index: ");
        int end = scanner.nextInt();

        String substringByCharAt = createSubstringUsingCharAt(text, start, end);
        String substringByBuiltIn = "";

        if (start >= 0 && end <= text.length() && start < end) {
            substringByBuiltIn = text.substring(start, end);
        }

        System.out.println("\nSubstring using charAt(): " + substringByCharAt);
        System.out.println("Substring using substring(): " + substringByBuiltIn);

        boolean isEqual = compareStrings(substringByCharAt, substringByBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);
    }
}
