import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int count = 0;
        if(num>1){
            for(int i=1; i<=num; i++){
                if(num%i == 0)
                    count++;
            }
            if(count==2) {
                System.out.println("number is prime");
            } else {
                System.out.println("number is not prime");
            }
        } else
            System.out.println("number is not prime");
    }
}
