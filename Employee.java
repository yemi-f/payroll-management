abstract class Employee implements Payable {
    private String firstName;
    private String lastName;
    private String sin;

    public Employee(String fName, String lName, String sn) {
        firstName = fName;
        lastName = lName;
        sin = sn;
    }

    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setSin(String sn) {
        sin = sn;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSin() {
        return sin;
    }

    public void print() {
        System.out.format("SIN: %s%nName: %s %s%nType: %s%n", sin, firstName, lastName, getClass().getName());
    }
}