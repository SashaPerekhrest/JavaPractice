public class Truck extends Car {
    private double loadCapacity;

    public Truck(String typeOfMovement, double weight, double maxSpeed, int wheelsCount, double loadCapacity) {
        super(typeOfMovement, weight, maxSpeed, wheelsCount);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return String.format("Нагрузка на колесо у грузовика: %.2f" , wheelLoad());
    }

    @Override
    public double wheelLoad() {
        return (super.getWeight() + loadCapacity) / super.getWheelsCount();
    }
}
