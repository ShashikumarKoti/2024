package java9.tryWithResources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResourceExample {

    public static void main(String[] args) throws FileNotFoundException {

        //In Java 7
        try(FileOutputStream fileStream=new FileOutputStream("javatpoint.txt")){
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }

        //In Java 9
        FileOutputStream fileStream1=new FileOutputStream("javatpoint.txt");
        try(fileStream1){
            String greeting = "Welcome to javaTpoint.";
            byte b[] = greeting.getBytes();
            fileStream1.write(b);
            System.out.println("File written");
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
