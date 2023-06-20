public class SalariedEmployee extends Employee{

    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double salary){
        super(firstName, lastName, socialSecurityNumber);
        try {
            setWeeklySalary(salary);
        } catch (SalariedException e) {
            e.printStackTrace();
        }
    }

    public void setWeeklySalary(double salary) throws SalariedException{
        try{
            if(salary < 0.0) throw new SalariedException();
        }
        catch(SalariedException e){
            e.printStackTrace();
        }

    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    public String toString(){
        return String.format("Salaried employee: %s\n%s: $%,.2f",super.toString(), "weekly salary", getWeeklySalary());
    }
}
