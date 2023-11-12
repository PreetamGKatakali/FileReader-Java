package FileReadingAndWrite;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaReadFile {
   public static void main(String[] args) throws IOException {
        try {
            FileReader fr=new FileReader("C:\\Users\\gkata\\Desktop\\n" + //
                    "ew test\\File Reading In Java\\FileReadingAndWrite\\hello.txt");
            System.out.println("read by char by char");
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   } 
}
