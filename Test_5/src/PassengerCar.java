public class PassengerCar extends Car{
    private String model;
    private String brand;
    public PassengerCar(String typeOfMovement, double weight, double maxSpeed, int wheelsCount, String model, String brand) {
        super(typeOfMovement, weight, maxSpeed, wheelsCount);
        this.brand = brand;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return brand + " " + model + " максимальная скорость = " + super.getMaxSpeed();
    }
}
