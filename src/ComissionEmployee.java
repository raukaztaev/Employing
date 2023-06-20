public class ComissionEmployee extends Employee{

    private double grossSales;
    private double comissionRate;

    public ComissionEmployee(String firstName, String lastName, String socialSecurityNumber, double sales, double rate) {
        super(firstName, lastName, socialSecurityNumber);
        setGrossSales(sales);
        setComissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = (sales < 0) ? 0.0 : sales;
    }

    public void setComissionRate(double rate) {
        comissionRate = ((rate > 0.0) && (rate < 1.0)) ? rate : 0.0;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double getComissionRate() {
        return comissionRate;
    }

    @Override
    public double earnings() {
        return getComissionRate() * getGrossSales();
    }

    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f","comission employee",super.toString(),"gross sales",getGrossSales(),"comission rate", getComissionRate());
    }
}
