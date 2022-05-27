package UniqueLastNamesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniqueLastNames {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    ArrayList<Person> list = new ArrayList<>();

    System.out.println("Enter person's information: ");

    while(true){

        System.out.println("Continue personal information input? Press enter to conitue. Type 'quit' to end:");
        String input = scanner.nextLine();

        if(input.equals("quit")) {
            break;
        } else{

        System.out.println("Input first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Input last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Input year of birth: ");
        int year = Integer.valueOf(scanner.nextLine());
        list.add(new Person(firstName, lastName, year));
        }
    }

    System.out.println("Unique last names in alphabetical order:");
    list.stream()
        .map(person -> person.getLastName())
        .distinct()
        .sorted()
        .forEach(System.out::println);

    }
}
