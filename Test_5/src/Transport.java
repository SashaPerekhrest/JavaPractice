public class Transport {
    private String typeOfMovement;
    private double weight;
    private double maxSpeed;

    public Transport(String typeOfMovement, double weight, double maxSpeed) {
        this.typeOfMovement = typeOfMovement;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public double getWeight() {
        return weight;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "тип: " + typeOfMovement + ", максимальная скорость: " + maxSpeed;
    }
}
