import java.util.Arrays;

public class TwoArraysEqualOrNot {
    public static void main(String[] args) {
        int[] arr1 = {2,6,3,9,4};
        int[] arr2 = {2,6,3,9,4};

        // Approach 1 - using inbuild .equals method
        /*boolean status = Arrays.equals(arr1,arr2);
        if (status == true)
            System.out.println("Arrays are EQUAL");
        else
            System.out.println("Arrays are NOT EQUAL");
    */

        // Approach 2

        boolean status = true;
        if(arr1.length == arr2.length) {
            for (int i=0; i < arr1.length; i++){
                if (arr1[i] != arr2[i]) {
                    status = false;
                }
            }
        }

        else {
            status = false;
        }

        if (status == true)
            System.out.println("Arrays are EQUAL");
        else
            System.out.println("Arrays are NOT EQUAL");
    }
}
