package exception;

public class TestMyException {
    public static void main(String[] args) throws MyException {
        try {
            int[] test = null;
            var result = test[0];
        } catch (Exception e){
            throw new MyException("Так нельзя!");
        }
    }
}
