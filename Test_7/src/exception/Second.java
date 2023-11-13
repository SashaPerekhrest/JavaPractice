package exception;

public class Second {

    public static void main(String[] args) {
        String[] array = new String[3];

        testNullPointerException(array);
        testArrayIndexOutOfBoundsException(array, 1); //вызовы без ошибок
        testNegativeArraySizeException(5);

        try {
            testNullPointerException(null);
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        try {
            testArrayIndexOutOfBoundsException(array, 10);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try {
            testNegativeArraySizeException(-5);
        } catch (NegativeArraySizeException e){
            System.out.println("index" + e.getMessage());
        }
    }

    public static void testNullPointerException(String[] array){
        array[0] = "simple";
    }

    public static void testArrayIndexOutOfBoundsException (String[] array, int index){
        array[index] = "simple";
    }

    public static void testNegativeArraySizeException(int size){
        var test = new int[size];
    }
}