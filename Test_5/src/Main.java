public class Main {
    public static void main(String[] args) {
        Transport[] transports = new Transport[]{
                new PassengerCar("наземный", 2, 180, 4, "x5", "BMW"),
                new Truck("наземный", 4, 90, 6, 3),
                new Transport("Воздушный", 6,  400)
        };
        for (Transport transport : transports){
            System.out.println(transport.toString());
        }
    }
}