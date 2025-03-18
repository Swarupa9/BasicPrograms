public class SumOfElementsArray {
    public static void main(String[] args) {
        int[] arr = {2,5,4,7,9,4,10};

        int sum = 0;
        /*for(int i=0; i < arr.length; i++){
            sum = sum + arr[i];
        }*/

        // Enhanced For Loop
        for( int value : arr){
            sum=sum+value;
        }

        System.out.println(sum);
    }
}
