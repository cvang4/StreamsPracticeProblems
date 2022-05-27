package UniqueLastNamesExercise;

public class Person {
    
    private String firstName;
    private String lastName;
    private int year;

    public Person(String firstName, String lastName, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    } 

}
