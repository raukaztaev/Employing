public class BasePlusCommissionEmployee extends ComissionEmployee{

   private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double rate, double salary) {
        super(firstName, lastName, socialSecurityNumber, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary){
        baseSalary = (salary < 0) ? 0.0 : salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    public String toString(){
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried",super.toString(),
                "base-salary",getBaseSalary());
    }
}
