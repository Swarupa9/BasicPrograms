import java.util.Random;

public class GenerateRandomNumbersAndStrings {
    public static void main(String[] args) {

        // Appraoch 1 - Random class
        Random rndm = new Random();
        int rndm_int = rndm.nextInt(10);    // print 1 number btwn 1 to 9
        System.out.println(rndm_int);
        int rndm_int2 = rndm.nextInt(1000);  // print number btwn 1 to 999
        System.out.println(rndm_int2);
        Double rndm_double = rndm.nextDouble();     // print number btwn 0.0 to 0.1
        System.out.println(rndm_double);

        // Appraoch 2 - random method of Math class
        System.out.println(Math.random());

        // Apprauch 3 - Apache commons- lang API
        // Used to generate random numbers and random Strings


    }
}
