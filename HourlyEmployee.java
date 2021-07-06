public class HourlyEmployee extends Employee {
    private static double UNION_DUES_PERCENTAGE = 1.55;
    private double wage;
    private double hours;

    public HourlyEmployee(String fName, String lName, String sn, double wg, double hrs) {
        super(fName, lName, sn);
        setWage(wg);
        setHours(hrs);
    }

    public double getHours() {
        return hours;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hrs) {
        if (hours >= 0 && hours <= 168) {
            hours = hrs;
        } else {
            throw new IllegalArgumentException("Hours must be between 0 and 168");
        }
    }

    public void setWage(double wg) {
        if (wg < 0) {
            throw new IllegalArgumentException("Wage must be greater than 0");
        } else {
            wage = wg;
        }
    }

    private double getGrossWeeklyPaymentAmount() {
        if (hours > 40) {
            return wage * (40 + 1.5 * (hours - 40));
        }

        return hours * wage;
    }

    private double getUnionDeductions() {
        return getGrossWeeklyPaymentAmount() - getWeeklyPaymentAmount();
    }

    public double getWeeklyPaymentAmount() {
        return getGrossWeeklyPaymentAmount() * (1 - UNION_DUES_PERCENTAGE / 100);
    }

    public void print() {
        super.print();
        System.out.format("Hourly wage: $%.2f%nHours worked: %.2f%nUnion deductions: $%.2f%n", wage, hours,
                getUnionDeductions());
    }
}
