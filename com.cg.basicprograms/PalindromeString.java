import java.util.Scanner;

// Palindrome string is the string that remains the same when its characters are reversed. Like MADAM
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.next();
        String orgStr = str;

        String rev = "";
        int len = str.length();
        for(int i = len-1; i>=0; i--) {
            rev = rev + str.charAt(i);

        }
        // orgStr.equals(rev)
        if(orgStr.equalsIgnoreCase(rev) ) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
