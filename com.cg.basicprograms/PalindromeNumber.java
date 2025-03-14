import java.util.Scanner;

public class PalindromeNumber {
    //Palindrome number is the number that remains same when its digits are reversed. Like 16461

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int prevNum= num;
        int rev = 0;
        while( num != 0 ){
            rev = rev*10 + num%10;
            num = num/10;
        }
        if (prevNum == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
