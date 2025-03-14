public class LargestOfThreeNum {
    public static void main(String[] args) {

        int a = 14, b = 15, c = 19;

      /*int largest = (a>b)?a:b;
      int largest = c>largest ? c : largest;*/

        //int largest = c>((a>b)?a:b) ? c : (a>b)?a:b;

        int largest = a > (b>c ? b : c) ? a : (b>c ? b : c);

        System.out.println(largest);
        /*if (a>b && a>c) {
            System.out.println(a);
        }else if (b>a && b>c) {
            System.out.println(b);
        } else
            System.out.println(c);*/
    }
}
