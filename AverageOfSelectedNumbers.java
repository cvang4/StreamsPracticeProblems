import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class AverageOfSelectedNumbers {
    
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

        while(true) {
            System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
            String input = scanner.nextLine();

            //Calculate all the negative numbers
            if(input.equals("n")) {
                double negativeNumbers = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();
                System.out.println("Average of the negative numbers: " + negativeNumbers);
                break;
            } 
            //Calculate all the positive numbers
            if(input.equals("p")) {
                double positiveNumbers = numbers.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(number -> number >= 0)
                .average()
                .getAsDouble();
                System.out.println("Average of the positive numbers: " + positiveNumbers);
                break;
            }
        }
    }
}
