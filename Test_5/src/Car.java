public class Car extends Transport{
    private int wheelsCount;
    public Car(String typeOfMovement, double weight, double maxSpeed, int wheelsCount) {
        super(typeOfMovement, weight, maxSpeed);
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    public double wheelLoad(){
        return super.getWeight() / wheelsCount;
    }
}
