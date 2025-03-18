public class MissingNumberInArray {
    public static void main(String[] args) {

        // Array should not have duplicate
        // Array need not to be sorted order
        // Values should be in range
        int a[] = {1,2,3,4,5,7};

        // 1+2+4+5 = 12 - sum1
        // 1+2+3+4+5 = 15 - sum2
        // sum2 - sum1 = 15-12=3 - missing number

        int sum1 = 0;
        for (int i=0; i<a.length; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println(sum1);

        int sum2 = 0;
        for(int i=1; i<=7; i++) {
            sum2 = sum2 + i;
        }
        System.out.println(sum2);

        int misNum = sum2 - sum1;
        System.out.println("missing Number: "+misNum);
    }
}
