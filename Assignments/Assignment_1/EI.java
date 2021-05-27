/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/


package canadian.payroll;

public class EI extends Deduction {

    public EI(Employee employee) {
        super(employee);
    }

    public double computeAmount() {

        double income = employee.getIncome();
        //INSERT YOUR CODE HERE - Using the specification given on EI
        double premiums;
        double eiRate = 0.0158;
        double maximum = 856.36;

        premiums = Math.min(maximum, (income * eiRate));

        return premiums;
    }

    public double getAmount() {
        amount = computeAmount(); //computes the applicable EI
        amount = Math.round(amount * 100.0) / 100.0; //rounding off to 2dp
        return amount;
    }
}