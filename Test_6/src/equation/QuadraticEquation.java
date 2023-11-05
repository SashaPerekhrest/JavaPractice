package equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        var out = "";
        if (a != 0)
        {
            if (a == 1)
                out += "x^2";
            else
                out += a + "x^2";
        }

        if(b != 0)
        {
            if(out != "")
                out += " + ";

            if (b == 1)
                out += "x";
            else
                out += b + "x";
        }

        if(out == "")
            out += c;
        else
            out += " + " + c + " = 0";

        return out;
    }

    public String formatEquation(){
        if(a == 0)
        {
            if (b == 0)
                return "Число";
            return "Уравнение";
        }
        return "Квадратное уравненине";
    }
}
