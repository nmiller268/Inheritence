public class Worker extends Person {
    private double hourlyPayRate;

    // constructor
    public Worker(String fullName,  double hourlyPayRate) {
        super("J", "L","0","",0, "");
        this.hourlyPayRate = hourlyPayRate;
    }

    // calculateWeeklyPay method
    public double calculateWeeklyPay(double hoursWorked) {
        double totalPay;

        // if the hours worked is less than or equal to 40 hours
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * hourlyPayRate;
        }
        // if the hours worked is greater than 40 hours
        else {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            double regularPay = 40 * hourlyPayRate;
            totalPay = overtimePay + regularPay;
        }
        return totalPay;
    }

    // displayWeeklyPay method
    public String displayWeeklyPay(double hoursWorked) {
        double totalPay;
        double regularHours;
        double overtimeHours;
        double regularPay;
        double overtimePay;

        // if the hours worked is less than or equal to 40 hours
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * hourlyPayRate;
            regularHours = hoursWorked;
            overtimeHours = 0;
            regularPay = totalPay;
            overtimePay = 0;
        }
        // if the hours worked is greater than 40 hours
        else {
            overtimeHours = hoursWorked - 40;
            overtimePay = overtimeHours * (hourlyPayRate * 1.5);
            regularPay = 40 * hourlyPayRate;
            totalPay = overtimePay + regularPay;
            regularHours = 40;
            regularPay = regularHours * hourlyPayRate;
            overtimePay = overtimeHours * (hourlyPayRate * 1.5);
        }

        return "Regular Hours: " + regularHours + " hours, Regular Pay: $" + regularPay
                + "\nOvertime Hours: " + overtimeHours + " hours, Overtime Pay: $" + overtimePay
                + "\nTotal Pay: $" + totalPay;
    }
}
