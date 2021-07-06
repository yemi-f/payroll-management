public class PayrollDemo {
    public static void main(String[] args) {
        Employee[] employees = { new HourlyEmployee("Steph", "Curry", "123456", 21.00, 40),
                new HourlyEmployee("Lebron", "James", "234567", 22.62, 53.2),
                new SalariedEmployee("Logo", "Dame", "345678", 904.31),
                new SalariedEmployee("Robot", "Boy", "135246", 1200.00),
                new SalariedEmployee("Jimmy", "Neutron", "789012", 904.31),
                new HourlyEmployee("Square", "Sponge", "579680", 24.30, 42),
                new HourlyEmployee("Professor", "Prof", "246357", 30.21, 37.5) };

        for (Employee emp : employees) {
            emp.print();
            System.out.format("Net Pay: $%.2f%n%n", emp.getWeeklyPaymentAmount());
        }

    }
}
