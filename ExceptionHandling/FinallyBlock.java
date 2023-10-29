package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyBlock {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            FileInputStream fis = new FileInputStream("d:/abc.txt");
        } catch (Exception e) {
            System.out.println(e);

        }
        finally{
            //clean up code
            System.out.println("hello");
        }

    }
}

