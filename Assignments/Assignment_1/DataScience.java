/*Code Authored by:
***Dr. Opeyemi Olusegun Adesina
***School of Computing, University of the Fraser Valley, Abbotsford - Canada
***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
**/


package canadian;

import canadian.payroll.*;
import java.util.*;


public class DataScience {
	
	//argument the map of employees for the target province
	public static Employee leastPaidEmployee( String province, Map<Integer, Employee> map ) {
		
		//INSERT YOUR CODE HERE - study how allEmployees(...) is being implemented
		map = allEmployeesOf( province, map );
		if( map != null ) {
			double minimum = map.get(1).getIncome();
			for(  )
		}
		
		
		return null;
	}

	//argument the map of employees for the target province
	public static Employee highestPaidEmployee( String province, Map<Integer, Employee> map ) {
		
		//INSERT YOUR CODE HERE - see how allEmployees(...) is being implemented below. You may even reuse the code as well


		return null;
	}

	//computes a list of all employees by their province of residence
	public static Map<Integer, Employee> allEmployeesOf( String province, Map<Integer, Employee> map ) {
		
		province = Utility.formatProvince( province );
		Map<Integer, Employee> empMap = new Hashtable<Integer, Employee>();
		for( Map.Entry<Integer, Employee> entry : map.entrySet() ) {
			
			int key = entry.getKey();
			Employee value = ( Employee ) entry.getValue();
			if( value.getProvince().equals( province ) ) {
				empMap.put( key, value );
			}
		}
		return empMap; 
	}
}