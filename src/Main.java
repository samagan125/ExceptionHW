import javax.xml.xpath.XPath;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main extends Car{
    public static void main(String[] args) {
        FileOutputStream output = null;
             if (output!=null) {
            try {
                output.close();
            } catch (IOException e) {
                throw new RuntimeException(e);

            }
            output.getChannel();
            System.out.println(output);
        }

        try {
            output=new FileOutputStream("Bilal");
            output.write(9);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close();
        }
     drive();
    }
    public static void drive(){
        System.out.println("Машина журуп жатат.");
    }
}
