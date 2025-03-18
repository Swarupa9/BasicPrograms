public class EvenOddFromArray {
    public static void main(String[] args) {
        int[] arr = { 3,2,6,8,5,4,9};

        System.out.println("Even numbers in array: ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 == 0) {
                System.out.println(arr[i]);
            }
        }
        System.out.println("Odd numbers in array: ");
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%2 != 0) {
                System.out.println(arr[i]);
            }
        }
        // Enhanced For Loop
        /*System.out.println("Even numbers in array: ");
        for(int val: arr) {
            if(val%2 == 0)
                System.out.println(val);
        }
        System.out.println("Odd numbers in array: ");
        for(int val: arr) {
            if(val%2 != 0)
            System.out.println(val);
        }*/
    }
}
