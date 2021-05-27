/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/


package canadian.payroll;

import java.util.*;
import canadian.*;

public class GovernmentTax extends Deduction {
	
	boolean isProvincial = false;
	public static class TaxUtil {
		
		public static Map<Integer, TaxCategory> getEmployeeCategories( String provinceOrFederal ) {
			
			provinceOrFederal = Utility.formatProvince( provinceOrFederal.toLowerCase() );
			switch( provinceOrFederal ) {
				case "AB" : return alberta();
				case "BC" : return britishColumbia();
				case "MB" : return manitoba();
				case "NB" : return newBrunswick();
				case "NS" : return novaScotia();
				case "ON" : return ontario();
				case "SK" : return saskatchewan();
				default : return federal();
			}
		}
		
		//declares the catgeroies for the province of Manitoba
		public static Map<Integer, TaxCategory> manitoba() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				TaxCategory cat1 = new TaxCategory(10.8, 0, 33723);
				categories.put( 1, cat1 );
				TaxCategory cat2 = new TaxCategory(12.75, 33723.01, 72885);
				categories.put( 2, cat2 );
				TaxCategory cat3 = new TaxCategory(17.4, 72885.01, 100000000);
				categories.put( 3, cat3 );
			} catch( Exception e ) {}
			
			return categories;
		}

		//declares the catgeroies for the province of Alberta
		public static Map<Integer, TaxCategory> alberta() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				
			} catch( Exception e ) {}
			
			return categories;
		}

		//declares the catgeroies for the province of Quebec
		public static Map<Integer, TaxCategory> britishColumbia() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				
			} catch( Exception e ) {}
			
			return categories;
		}

		//declares the catgeroies for the province of New Brunswick
		public static Map<Integer, TaxCategory> newBrunswick() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				
			} catch( Exception e ) {}
			
			return categories;
		}

		//declares the catgeroies for the province of Nova Scotia
		public static Map<Integer, TaxCategory> novaScotia() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				
			} catch( Exception e ) {}
			
			return categories;
		}

		//declares the catgeroies for the province of Ontario
		public static Map<Integer, TaxCategory> ontario() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented

			} catch( Exception e ) {}
			
			return categories;
		}

		//declares the catgeroies for the province of saskatchewan
		public static Map<Integer, TaxCategory> saskatchewan() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				
			} catch( Exception e ) {}
			
			return categories;
		}
		
		//declares the catgeroies for the federal government
		public static Map<Integer, TaxCategory> federal() {
			
			HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
			try {
				//INSERT YOUR CODE HERE - Using the specification given on Federal
				//You will need to study how Manitoba is being implemented
				
			} catch( Exception e ) {}
			
			return categories;
		}
	}
	
	private Map<Integer, TaxCategory> categories;
	public GovernmentTax( Employee employee, String provinceOrFederal ) {
		
		super( employee );
		String province = provinceOrFederal;
		if( !( provinceOrFederal.equals("federal") || provinceOrFederal.equals( "fed" ) ) ) {
			province = employee.getProvince();
			isProvincial = true;
		}
		this.categories = TaxUtil.getEmployeeCategories( province );
	}
	
	public double computeAmount() {
		
		double income = employee.getIncome();
		//INSERT YOUR CODE HERE
		
		

		return 0.0;
	}
	
	public double getAmount() {
		return Math.round( computeAmount() * 100.0 ) / 100.0;
	}

	public boolean isProvincial() {
		return isProvincial;
	}
}