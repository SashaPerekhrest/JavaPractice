package generator;

public class SerialIntGenerator implements intGenerator{
    private static int counterP;
    private static int counterN;

    public SerialIntGenerator() {
        counterN = 0;
        counterP = 0;
    }

    @Override
    public int nextPositive() {
        if (counterP == 1000)
            counterP = 0;
        else
            counterP ++;
        return counterP;
    }

    @Override
    public int nextNegative() {
        if (counterN == -1000)
            counterN = 0;
        else
            counterN --;
        return counterN;
    }

    @Override
    public String getName() {
        return "Генератор на основе счетчика";
    }
}
