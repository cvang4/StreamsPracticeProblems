import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        System.out.println("Input numbers, type 'end' to stop.");


        while(true) {
            String number = scanner.nextLine();

            if(number.equals("end")) {
                break;
            }
            numbers.add(number);
        }

        //Calculating the average of numbers entered
        double average = numbers.stream()
        .mapToInt(s -> Integer.valueOf(s))
        .average()
        .getAsDouble();

        System.out.println("average of the numbers: " + average);
        scanner.close();
    }
}