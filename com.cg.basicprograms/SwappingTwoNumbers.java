public class SwappingTwoNumbers {

    public static void main(String[] args) {

        int a =10, b = 20 ;
        System.out.println("Before swapping: a: "+a+", b: "+b);
        //Method 1- using temp variable
        int temp = a;
        a = b;
        b = temp;

        //without using third variable or temp
        //Method 2- using + & - operator
       /* a = a+b;     // 10+20 = 30
        b = a-b;     // 30-20 = 10
        a = a-b;     // 30-10 = 20
*/
        //Method 3- using * & / operator
        /*a = a*b;    // 10*20 = 200
        b = a/b;    // 200/20 = 10
        a = a/b;    // 200/10 = 20
*/
        //Method 4- Single line
       /* b = a+b - (a=b);  */
        // equation will travel through right to left
        // first it'll solve bracket -> here we are assigning b value to a i.e., a=20
        // a+b = 30 - b -> 30-20 = 10 i.e., b=10

        System.out.println("After swapping: a: "+a+", b: "+b);
    }
}