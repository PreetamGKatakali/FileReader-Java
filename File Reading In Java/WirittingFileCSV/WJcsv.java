package WirittingFileCSV;

import java.io.File;
import java.io.FileWriter;





public class WJcsv {
    public static void main(String[] args) throws Exception {
        Student std=new Student(1,"alex", 9.6);
        Student std1=new Student(2,"smith", 8.6);

        Student[] arr={std,std1};
        File file=new File("student.csv");

        FileWriter filewriter=new FileWriter(file);
        StringBuilder str=new StringBuilder();
        str.append("id");
        str.append(",");
        str.append("name");
        str.append(",");
        str.append("grade");
        str.append("\n");
        filewriter.write(str.toString());
        str.delete(0, str.length());
       
       
        for(int i=0;i<arr.length;i++){
            str.append(arr[i].id);
            str.append(",");
            str.append(arr[i].name);
            str.append(",");
            str.append(arr[i].grade);
            str.append("\n");
            filewriter.write(str.toString());
            str.delete(0, str.length());

        }
       


        filewriter.close();


        
    }
}
