import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {

        // Approach 1 - Using FileReader and BufferReader
        FileReader fc = new FileReader("C:\\Users\\SWARCHAV\\intellij-workspace\\BasicPrograms\\com.cg.basicprograms\\Fileforread.txt");
        BufferedReader br = new BufferedReader(fc);
        String str;
        while ((str=br.readLine()) != null)
        {
            System.out.println(str);
        }
        br.close();
        
        // Approach 2 - Using Scanner and file
        /*
        File file = new File("C:\\Users\\SWARCHAV\\intellij-workspace\\BasicPrograms\\com.cg.basicprograms\\Fileforread.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        */

        // Approach 3 - without looping
        /*
        File file = new File("C:\\Users\\SWARCHAV\\intellij-workspace\\BasicPrograms\\com.cg.basicprograms\\Fileforread.txt");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
        */
    }
}
