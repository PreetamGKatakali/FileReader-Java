package ReadingCSVfile;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 * This program represent CSV file reader 
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        String filepath="C:\\Users\\gkata\\Desktop\\new test\\File Reading In Java\\ReadingCSVfile\\file.csv";
        FileReader fr=new FileReader(filepath);
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        while(line!=null){
            System.out.println(line);
            line=br.readLine();
        }
        br.close();
    }
}
