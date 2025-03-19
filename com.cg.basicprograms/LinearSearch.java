public class LinearSearch {
    public static void main(String[] args) {

        int[] a = {20,40,30,10,50};
        int searchElement = 10;
        boolean flag = false;
        for(int i=0; i<a.length; i++) {
            if (a[i] == searchElement) {
                System.out.println("Element fount at: "+i);
                flag = true;
            }
        }
        if (flag==false) {
            System.out.println("Element not found");
        }
    }
}
