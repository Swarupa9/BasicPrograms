import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // Method 1- using algorithm
        int rev=0;
        while(num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        // Method 2- using StringBuffer
        /*StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();*/

        // Method 3- using StringBuilder
        /*StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        */
        System.out.println("Reverse number is: "+rev);
    }
}
