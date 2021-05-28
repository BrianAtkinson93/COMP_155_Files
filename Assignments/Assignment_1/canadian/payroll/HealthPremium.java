/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package canadian.payroll;

public class HealthPremium extends canadian.payroll.Deduction {

    public HealthPremium(canadian.payroll.Employee employee) {
        super(employee);
    }

    public double computeAmount() {

        double income = employee.getIncome();
        //INSERT YOUR CODE HERE - Using the specification given on HealthPremium
        double cap1 = 22_000.00;
        double cap2 = 38_000.00;
        double cap3 = 50_000.00;
        double cap4 = 74_000.00;
        double cap5 = 202_000.00;
        double min1 = 300.00;
        double min2 = 450.00;
        double min3 = 600.00;
        double min4 = 750.00;
        double min5 = 900.00;
        double premiums = 0;


        if (income <= cap1)
            premiums = 0;
        else if (income <= cap2)
            premiums = Math.min(min1, (0.06 * (income - cap1)));
        else if (income <= cap3)
            premiums = Math.min(min2, (min1 + (0.06 * (income - cap2))));
        else if (income <= cap4)
            premiums = Math.min(min3, (min2 + (0.25 * (income - cap3))));
        else if (income <= cap5)
            premiums = Math.min(min4, (min3 + (0.25 * (income - cap4))));
        else if (income > cap5)
            premiums = Math.min(min5, (min4 + (0.25 * (income - cap5))));


        return premiums;

    }

    public double getAmount() {
        amount = computeAmount(); //computes the applicable CPP
        amount = Math.round(amount * 100.0) / 100.0; //rounding off to 2dp
        return amount;
    }
}