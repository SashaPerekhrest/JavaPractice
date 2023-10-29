public class Main {
    public static void main(String[] args) {
        var firstP = new Point(2.2, 3.3);
        var secondP = new Point(4,5);
        System.out.println("Первый point " +  firstP);
        System.out.println("Второй point " +  secondP);
        System.out.println("Сложение " + firstP.add(secondP));
        System.out.println("Вычитание " + firstP.sub(secondP));
        System.out.println("Умножение на 5 " + firstP.multiply(5));
    }
}