package exception;

public class MyException extends Exception{ // не до конца понял, как сделать свое исключение
    @Override
    public String getMessage() {
        return "Не съедобное";
    }
    public MyException() { super(); }
    public MyException(String message) { super(message); }
    public MyException(String message, Throwable cause) { super(message, cause); }
    public MyException(Throwable cause) { super(cause); }
}
