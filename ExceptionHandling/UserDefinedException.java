package ExceptionHandling;

public class UserDefinedException extends Exception {
    public UserDefinedException(String s){
        super(s);
    }
public static void main(String[]args){

        try{
            throw new UserDefinedException("GeekForGeeks");
        }
        catch (UserDefinedException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
        }
        }

