package MyMa;

import java.text.DecimalFormat;

public class Hyundai extends carLease implements carInterface {
    public Hyundai(String name, String whichModel, int age, int salary, int totalCost, int downPayment, int termofLease, int leaseFee, double taxRate, double moneyFactor) {
        super(name, whichModel, age, salary, totalCost, downPayment, termofLease, leaseFee, taxRate, moneyFactor);
    }

    @Override
    public String leaseMonthlyCalculator() {
        double result = calculateDepreciation() + calculateInterest() + taxes();
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedResult = df.format(result);
        return formattedResult;
    }

    public boolean isAligable(){
        if(getSalary() > hyundaiMinIncome){
            return true;
        }
        return false;
    }

    public String totalCalculator() {
        double result = (Double.valueOf(leaseMonthlyCalculator()) * termofLease) + documentationFees;
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedResult = df.format(result);
        return formattedResult;
    }
}
    /*
      get the connection with carLease and carInterface
        after the connection you should have constructor ,  leaseMonthlyCalculator method and isAligable method
    */

    /*
             leaseMonthlyCalculator   --->> return type is String
            calculation is --->> calculateDepreciation + calculateInterest + taxes (these methods are coming from the carLease method)
            hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11
    */

     /*
         isAligable
            if the salary is more then hyundaiMinIncome then true else false
     */


      /*
        method name is totalCalculator
        return type is String
        calculation :  (leaseMonthlyCalculator * termofLease) + documentationFees
        Format the calculation result
        hint:  after the calculation result result will be 2.11222211 you need to change result as a 2.11
     */
