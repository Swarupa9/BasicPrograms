public class StringReverseEachWord {
    // Four steps
    // original string                - Welcome to Java
    // split string into string array - [Welcome, to, Java]
    // iterate through string aaray   - w: Welcome
    // reverse each string            - emocleW
    // added in new string            - rvsstring + w

    public static void main(String[] args) {

        // Approach 1 - without using reverse() method
        String s = "Welcome to Java";
        String[] words = s.split(" ");   // To store the words in string into array of string --> s.split
        String revString = "";

        // 1st for loop- to iterate each word, 2nd for loop to reverse each word
        for(String w: words)         // iterate through each word in array of strings
        {
            String reverse = "";     // for storing reverse word
                                     // written inside for-each bcz need to initialize newly for every word
                                     // if intialize outiside of for-each then for 2nd string letters also
                                     // it will add in first reverse word without space
            for (int i=w.length()-1; i>=0; i--) {
                reverse = reverse + w.charAt(i);     // reverse each character of word and sote in "reverse"
            }
            revString = revString+reverse+" ";       // adding reversed word in "revString" and after that giving space.
                                                     // " " --> To make space between each word
        }
        System.out.println("Approach 1: "+revString);               // Printing whole string with each with reverse


        // Approach 2 - using reverse() method
        String s1 = "Hello World of Java";
        String[] strArray = s1.split("\\s");   // we can write " " OR "\\s" --> regex for space
        String reverseStringArray = "";
        String reverseWord = "";

        for(String word : strArray) {

            StringBuffer sb = new StringBuffer(word);
            sb.reverse();         // in-place reverse so it will store reverse word in 'sb'
            reverseWord = reverseWord+sb.toString()+" ";
        }
        System.out.println("Approach 2: "+reverseWord);
    }
}
