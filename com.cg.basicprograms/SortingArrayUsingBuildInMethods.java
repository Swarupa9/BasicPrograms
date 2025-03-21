import java.util.Arrays;
import java.util.Collections;

public class SortingArrayUsingBuildInMethods {
    public static void main(String[] args) {

        int[] a = {30,20,50,10,60};
        System.out.println("Before sorting: "+Arrays.toString(a));

        //Arrays.parallelSort(a): Sorts the array using multiple threads (parallel processing). Faster for large arrays, but may have overhead for smaller arrays.
        //Arrays.sort(a): Sorts the array using a single thread (sequential processing). Efficient for smaller arrays.
        //Both methods sort the array in place.

        // Approach 1 - parallelSort- Sort the array in parallel
        /*Arrays.parallelSort(a);
        System.out.println("After sorting: "+Arrays.toString(a));
*/
        // Approach 2 - sort method
       /* Arrays.sort(a);
        System.out.println("After sorting: "+Arrays.toString(a));*/

        // Approach 3 - reverse order- Descending order
        // But its using collection so collection is not support premitive data type
        // int not allowed so type of array is Integer
        Integer[] b = {70,40,10,90,20};
        System.out.println("Before sorting: "+Arrays.toString(b));
        Arrays.sort(b, Collections.reverseOrder());
        System.out.println("After sorting: "+Arrays.toString(b));
    }
}
