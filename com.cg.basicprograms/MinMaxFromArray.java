public class MinMaxFromArray {
    public static void main(String[] args) {
        int[] a = {2,8,5,1,3,6};

        int max = a[0];
        int min = a[0];

        for(int i=0; i<a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max =a[i];
        }
        System.out.println("min: "+min);
        System.out.println("max: "+max);


    }
}
