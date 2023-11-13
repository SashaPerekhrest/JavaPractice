import exception.First;
import exception.Second;
import exception.MyException;
import exception.TestMyException;

public class Main {
    public static void main(String[] args) throws MyException {
        First.main(args);
        System.out.println("*****************************************************");
        Second.main(args);
        System.out.println("*****************************************************");
        TestMyException.main(args);
    }
}