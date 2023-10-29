package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//compiletime exception or checked exception
public class Checked_ComplietimeException {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis=new FileInputStream("d:/abc.txt");
    }
}
