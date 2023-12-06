import java.lang.invoke.LambdaConversionException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        Runnable printFunc = () -> System.out.println("test");
        Consumer<String> printCons = x -> System.out.println(x);
        BinaryOperator<Integer> summ = (x, y) -> x + y;
        Supplier<Integer> randInt = () -> new Random().nextInt();
        BiPredicate<String,String> check = (s1, s2) -> s1.length() > s2.length();
        BinaryOperator<String> getMaxLen = (s1, s2)-> s1.length() > s2.length() ? s1 : s2;

        List<String> names = List.of("name 1", "name 2", "name 3");
        var djankj = names.stream().count();

        printCons.accept(String.valueOf(djankj));

        var firstRequest = new Random().ints(1000, 10 , 10000).mapToObj(x -> x).toList();
        var secondRequest = new Random().ints(1000, 10 , 10000).count();
        var thirdRequest = new Random().ints(1000, 10 , 10000).reduce(0, (summa, x) -> summa + x);
        new Random().ints(1000, 10 , 10000).forEach(x -> printCons.accept(String.valueOf(x)));
        var fifthRequest = new Random().ints(1000, 10 , 10000)
                .boxed()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), i -> i*i));

        printCons.accept(String.valueOf(fifthRequest));

        List<String> sample = List.of("name 1", "name 1", "name 2", "name 3", "na");
        sample.stream()
                .distinct()
                .filter(x-> x.length() > 3)
                .map(x->x.toUpperCase())
                .forEach(x-> printCons.accept(x));
    }
}