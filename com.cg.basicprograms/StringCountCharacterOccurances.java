public class StringCountCharacterOccurances {
    public static void main(String[] args) {

        String s = "counting character";
        int totalcount = s.length();
        //s.replace("a,A","");
        int revisedcount = s.replace("c","").length();
        int charOcc = totalcount - revisedcount;
        System.out.println(charOcc);
    }
}
