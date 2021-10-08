package com.company;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
                              int socNumber,
                              double grossSales, double commissionRate){
        super(firstName, lastName, socNumber);
        if(grossSales< 0.0) {
            throw new IllegalArgumentException("gross sales must be >= 0.0");
        }
        if(commissionRate< 0.0 || commissionRate> 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.commissionRate= commissionRate;
        this.grossSales= grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        if(grossSales< 0.0) {
            throw new IllegalArgumentException("gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if(commissionRate< 0.0 || commissionRate> 1.0){
            throw new IllegalArgumentException("Commission rate must be between 0.0 and 1.0");
        }
        this.commissionRate = commissionRate;
    }
    public double earnings(){
        return getCommissionRate() * getGrossSales();
    }
    @Override
    public String toString(){
        return String.format("%n%s%s%n%s: %s", "The commission employee details are" +
                " as follows",super.toString(),"Earnings", earnings() );
    }
}
