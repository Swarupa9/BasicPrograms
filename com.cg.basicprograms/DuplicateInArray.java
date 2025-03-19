import java.util.HashSet;

public class DuplicateInArray {
    public static void main(String[] args) {
        //int[] a = {5,7,2,9,5,6,8,2};
        String[] a = {"java", "c", "c++", "python", "JS", "c++", "golang", "java"};
        //String[] a = {"java", "c", "c++", "python", "JS", "golang"};

        // Approach 1
        /*boolean flag = false;
        for(int i=0; i< a.length; i++) {
            for(int j=i+1; j< a.length; j++) {
                if (a[i] == a[j]){
                    System.out.println("Duplicate element found: "+a[i]);
                    flag = true;
                }
            }
        }
        if (flag == false) {
            System.out.println("Duplicate element not found");
        }
*/
        // Approach 2
        boolean flag = false;
        HashSet<String> lang = new HashSet<>();

        // HashSet not allow dulicate values so if we try to add and print then for duplicate it return false
        // System.out.println(lang.add("java");    ---> true
        // System.out.println(lang.add("python");  ---> true
        // System.out.println(lang.add("java");    ---> false

        for (String l: a) {
            if (lang.add(l) == false) {
                System.out.println("duplicate found: "+l);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("No duplicate found");
        }
    }
}
