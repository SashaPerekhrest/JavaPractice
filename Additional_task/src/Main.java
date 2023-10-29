public class Main {
    public static void main(String[] args) {
        double a = 3.4;
        double b = 13.1;
        System.out.println(String.format("Числа %s %s", a, b));
        System.out.println(String.format("Сумма: %s", MathAll.Summ(a,b)));
        System.out.println(String.format("Разность: %s", MathAll.Sub(a,b)));
        System.out.println(String.format("Произведение: %s", MathAll.Mult(a,b)));
        System.out.println(String.format("Частное: %s", MathAll.Div(a,b)));
        System.out.println(String.format("Среднеарифметическое: %s", MathAll.ArithmeticMean(a,b)));
        System.out.println(String.format("Среднегеометрическое: %s", MathAll.AverageGeometric(a,b)));

        a = MathAll.Mult(a,a);
        b = MathAll.Mult(b,b);
        System.out.println();
        System.out.println(String.format("Квадраты чисел %s %s", a, b));
        System.out.println(String.format("Сумма: %s", MathAll.Summ(a,b)));
        System.out.println(String.format("Разность: %s", MathAll.Sub(a,b)));
        System.out.println(String.format("Произведение: %s", MathAll.Mult(a,b)));
        System.out.println(String.format("Частное: %s", MathAll.Div(a,b)));
        System.out.println(String.format("Среднеарифметическое: %s", MathAll.ArithmeticMean(a,b)));
        System.out.println(String.format("Среднегеометрическое: %s", MathAll.AverageGeometric(a,b)));
    }
}