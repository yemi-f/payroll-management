public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String fName, String lName, String sn, double salary) {
        super(fName, lName, sn);
        setWeeklySalary(salary);
    }

    public void setWeeklySalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary must be greater than 0");
        } else {
            weeklySalary = salary;
        }
    }

    public double getWeeklyPaymentAmount() {
        return weeklySalary;
    }

    public void print() {
        super.print();
        System.out.format("Weekly salary: $%.2f%n", weeklySalary);
    }
}
