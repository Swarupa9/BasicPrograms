import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {
    public static void main(String[] args) throws IOException {

        // Using FileWriter and BufferedWriter
        FileWriter fw = new FileWriter("C:\\Users\\SWARCHAV\\intellij-workspace\\BasicPrograms\\com.cg.basicprograms\\FileforWrite.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("This is for example of How to write data into text file");
        bw.write("Here we use FileWriter and BufferedWriter classes");
        bw.write("If file is present on location given in path then it will write given lines in that file");
        bw.write("file is present on location given in path then It will create new file and write given lines");

        System.out.println("Writing inished !!");

        bw.close();
    }
}

