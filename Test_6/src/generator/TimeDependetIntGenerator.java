package generator;

public class TimeDependetIntGenerator implements intGenerator{
    @Override
    public int nextPositive() {
        double time = System.currentTimeMillis();
        int out = (int) ((time % 1987)/1987 * 1000);
        return out;
    }

    @Override
    public int nextNegative() {
        double time = System.currentTimeMillis();
        int out = (int) ((time % 1987)/1987 * (-1000));
        return out;
    }

    @Override
    public String getName() {
        return "Генератор на основе времени";
    }
}
