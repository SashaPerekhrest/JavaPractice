import equation.*;
import generator.*;

public class Main {
    public static void main(String[] args) {
        demoQuadraticEquation();
        System.out.println();
        demoIntGenerator();
    }

    public static void demoQuadraticEquation() {
        var quadraticEquation = new QuadraticEquation[]{
                new QuadraticEquation(1,1,1),
                new QuadraticEquation(2.2,0,1),
                new QuadraticEquation(0,3.3,4),
                new QuadraticEquation(0,0,5.5),
                new QuadraticEquation(3.5,1,6.2)
        };

        for(var equation : quadraticEquation)
            System.out.println(equation.toString() + " " + equation.formatEquation());
    }

    public static void demoIntGenerator(){
        var generators = new intGenerator[]{
                new RandomIntGenerator(),
                new TimeDependetIntGenerator(),
                new SerialIntGenerator()
        };

        for (var i = 0; i <10;i++) { // несколько проходов показывают, как работает счетчик и одинаковые показатели от времени
            for (var generator : generators) {
                System.out.println(generator.getName());
                System.out.println("Случайное положительное " + generator.nextPositive());
                System.out.println("Случайное отрицательное " + generator.nextNegative());
                System.out.println();
            }
        }
    }
}