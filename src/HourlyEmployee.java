public class HourlyEmployee extends Employee{

    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hourlyWage, double hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        wage = (hourlyWage < 0.0) ? 0.0 : hourlyWage;
    }

    public void setHours(double hoursWorked) {
        hours = ((hoursWorked > 0.0) && (hoursWorked < 168.0)) ? hoursWorked : 0.0;
    }

    public double getWage() {
        return wage;
    }

    public double getHours() {
        return hours;
    }

    @Override
    public double earnings() {
        if(getHours() <= 40) return getWage() * getHours();
        else return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
    }

    public String toString(){
        return String.format("Hourly employee: %s\n%s: $%,.2f; %s: %,.2f",super.toString(), "hourly wage", getHours(),"hours worked",getHours());
    }
}
