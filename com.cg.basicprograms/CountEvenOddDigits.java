import java.util.Scanner;

public class CountEvenOddDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();         // 1234

        int evenCount=0;
        int oddCount=0;
        while(num > 0){           // 1234  123  12   1
            int rem = num%10;     // 4     3    2    1

            if(rem % 2 == 0){
                evenCount++;      // 1          2
            }else{
                oddCount++;       //      1          2
            }
            num = num /10;       //  123  12  1   0
        }
        System.out.println("Even Conut: "+evenCount);
        System.out.println("Odd Count: "+oddCount);
    }
}
