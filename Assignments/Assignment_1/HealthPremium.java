/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/

package canadian.payroll;

public class HealthPremium extends Deduction {
	
	public HealthPremium( Employee employee ) {
		super( employee );
	}
	
	public double computeAmount() {
		
		double income = employee.getIncome();
		//INSERT YOUR CODE HERE - Using the specification given on HealthPremium


		return 0.0;
	}
	
	public double getAmount() {
		amount = computeAmount(); //computes the applicable CPP
		amount = Math.round( amount * 100.0 ) / 100.0; //rounding off to 2dp
		return amount;
	}
}