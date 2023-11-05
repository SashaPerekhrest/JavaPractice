package generator;

public class TimeDependetIntGenerator implements intGenerator{
    @Override
    public int nextPositive() {
        double time = System.currentTimeMillis();
        int out = (int) ((time % 10001)/10001 * 1000);
        return out;
    }

    @Override
    public int nextNegative() {
        double time = System.currentTimeMillis();
        int out = (int) ((time % 10001)/10001 * (-1000));
        return out;
    }

    @Override
    public String getName() {
        return "Генератор на основе времени";
    }
}
