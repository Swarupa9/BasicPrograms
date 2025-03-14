import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String str = "Swarupa";
        String rev = "";

        // Method 1- using charAt() function
        /*int len = str.length();
        for(int i=len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        */

        // Method 2- using char array
        /*char[] arr = str.toCharArray();
        int len = arr.length;
        for(int i=len-1; i>=0; i--){
            rev = rev + arr[i];
        }
        System.out.println(rev);
        */

        // Method 3- using StringBuffer
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
