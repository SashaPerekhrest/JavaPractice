package generator;

public final class RandomIntGenerator implements intGenerator{
    @Override
    public int nextPositive() {
        return (int)(Math.random() * 1000);
    }

    @Override
    public int nextNegative() {
        return (int)(Math.random() * (-1000));
    }

    @Override
    public String getName() {
        return "Генератор на основе Math.random";
    }
}
