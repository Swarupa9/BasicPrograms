import java.util.Arrays;

public class BinarySearch {
    // Binary search is faster that Linear search
    // In Linear search we need to iterate through each and every element of array
    // and to compare every element with key
    // In binary search we are dividing array into two parts by comaring key with mid value
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5,6,7,8,9};  // Should be in sorted order
        int searchKey = 8;

        // Approach 1 - Logic
        // l - lower, h - higher alternative left, right
        boolean flag = false;
        int l = 0;
        int h = a.length-1;
        // int mid =(l+h)/2;  // we are updating l and h depending on the cases and for mid
                              // we need to calculate it at every iteration so we need
                              // to write it inside while loop

        while ( l <= h)
        {
            int mid =(l+h)/2;      // It should be inside while loop
                                   // bcz after every iteration we need to update the value of mid
            if ( a[mid] == searchKey ) {
                System.out.println("Key found at: "+ mid);
                flag = true;
                break;
            }
            else if (searchKey < a[mid] ) {
                h = mid-1;
            }
            else if (searchKey > a[mid] ) {
                l = mid+1;
            }
        }
        if (flag == false) {
            System.out.println("Key not found in array");
        }

        // Approach 2 - using inbuild method - Arrays.BinarySearch()
        /*
        System.out.println(Arrays.binarySearch(a,searchKey));
        */
    }
}
