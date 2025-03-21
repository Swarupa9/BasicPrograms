public class StringRemoveWhiteSpaces {
    public static void main(String[] args) {
        // '\\s' is a regular expression pattern that denotes a whitespace character.
        // This includes spaces, tabs, and newline characters.
        String s = "Removing white       spaces  from     String";
        s = s.replaceAll("\\s","");
        System.out.println("After removing white spaces string is: " +s);

    }
}
