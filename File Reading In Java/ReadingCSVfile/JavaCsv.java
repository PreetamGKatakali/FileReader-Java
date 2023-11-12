package ReadingCSVfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JavaCsv {
    public static void main(String[] args) throws IOException {
        String filepath="C:\\Users\\gkata\\Desktop\\new test\\File Reading In Java\\ReadingCSVfile\\file.csv";
        try {
            FileReader fr=new FileReader(filepath);
            BufferedReader br=new BufferedReader(fr);
            String line=br.readLine();
            boolean flag=true;
            while(line!=null){
                if(flag){
                    line=br.readLine();
                    flag=false;
                    continue;
                }
                String[] str=line.split(",");
                // System.out.println(Arrays.toString(str));
                Student std=new Student();
                std.setId(Integer.parseInt(str[0]));
                std.setName(str[1]);
                std.setGrade(new Double(str[2]));
                System.out.println(std);
                try {
                    line =br.readLine();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            br.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        
    }
}
