import exception.First;
import exception.Second;
import exception.MyException;
import exception.TestMyException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws MyException {
        First.main(args);
        System.out.println("*****************************************************");
        Second.main(args);
        System.out.println("*****************************************************");
        TestMyException.main(args);
    }
}