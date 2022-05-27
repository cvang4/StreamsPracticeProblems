import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(7);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-2);
        numbers.add(-4);
        numbers.add(-9);
        System.out.println(positive(numbers));

    }
        public static List<Integer> positive(List<Integer> numbers) {
            return numbers.stream()
            .filter(n -> n > 0)
            .collect(Collectors.toList());
        }

    }
