import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] a = { 4,7,2,9,8};
        int n = a.length -1;
        System.out.println("Before sorting"+Arrays.toString(a));

        for (int i=0; i<n-1; i++)         // for number of passes
        {
            for (int j=0; j<n; j++)       // for iterating values for each pass
            {
                if (a[j] > a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("After sorting"+Arrays.toString(a));
    }
}
/*
    a       4 2 1 5 3    n=5

    Pass1   --> a[] = {4 2 1 5 3}
            2-4 1 5 3           compare a[0] and a[1] 4<2 - false --> swap
            2 1-4 5 3           compare a[1] and a[2] 4<1 - false --> swap
            2 1 4-5 3           compare a[2] and a[3] 4<5 - true --> No swap
            2 1 4 3-5           compare a[3] and a[4] 5<3 - false --> swap
            --> 5 --> bubble up
                      (after one pass we definately got largest value at end of array, called bubble up)
    Pass2   --> a[] = {2 1 4 3 5}
            1-2 4 3 5           compare a[0] and a[1] 2<1 - false --> swap
            1 2-4 3 5           compare a[1] and a[2] 2<4 - true --> No swap
            1 2 3-4 5           compare a[2] and a[3] 4<3 - false --> swap
            1 2 3 4-5           compare a[3] and a[4] 4<5 - true --> No swap
            --> 4 5 --> bubble up

    Pass3
            1-2 3 4 5
            1 2-3 4 5
            1 2 3-4 5
            1 2 3 4-5
            --> 3 4 5 --> bubble up

    Pass4
            1-2 3 4 5
            1 2-3 4 5
            1 2 3-4 5
            1 2 3 4-5
            --> 2 3 4 5 --> bubble up
Required passes - n-1 Passes
 if array got sorted at any pass then also all iterations (n-1) will happen
 */