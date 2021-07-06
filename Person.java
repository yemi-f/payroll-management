import java.util.UUID;

public class Person {
    // private String id = UUID.randomUUID().toString();
    private String id;
    private String firstName;
    private String lastName;

    public Person() {
        id = UUID.randomUUID().toString();
        firstName = "";
        lastName = "";
    }

    public Person(String fName, String lName) {
        id = UUID.randomUUID().toString();
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public void print() {
        System.out.format("%-40s %-12s %-12s", id, firstName, lastName);
    }
}
