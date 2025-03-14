import java.sql.SQLOutput;
import java.util.Scanner;

public class FibnocciSeries {

    //Fibnocci Series - 0 1 1 2 3 5 8 13 21 .......
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int n1 = 0, n2 = 1;
        int sum = 0;

        System.out.print(n1+" "+n2);
        for(int i=2; i<num; i++){
            sum = n1 + n2;
            System.out.print(" "+sum);
            n1 = n2;
            n2 = sum;
        }

    }

    /*int fib(int n){
        int fibn = n * n-1 ;

    }*/
}
