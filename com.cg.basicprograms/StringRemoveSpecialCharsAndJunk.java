public class StringRemoveSpecialCharsAndJunk {
    public static void main(String[] args) {
// Approach - using replace all method which take Regular expression and value for replacement
        String s  = " Clean&@* (!Str;'[i %^ ng|34";
        s = s.replaceAll("[^a-zA-Z0-9]", "");  // for replacement, we gave empty (nothing)
        System.out.println(s);
    }
}
