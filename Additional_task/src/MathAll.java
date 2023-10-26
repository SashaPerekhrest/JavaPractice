public class MathAll {
    private MathAll(){}

    public static double Summ(double a, double b) {
        return a + b;
    }

    public static double Sub(double a, double b) {
        return a - b;
    }

    public static double Mult(double a, double b){
        return a * b;
    }

    public static double Div(double a, double b){
        return  a / b;
    }

    public static double ArithmeticMean(double a, double b){
        return (a + b) / 2;
    }

    public static double AverageGeometric(double a, double b){
        return StrictMath.sqrt(a * b);
    }
}
