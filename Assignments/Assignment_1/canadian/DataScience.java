/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/


package canadian;

import canadian.payroll.*;

import java.util.*;


public class DataScience {
    private static Employee leastPaidEmployee = null;
    private static Employee highestPaidEmployee = null;
    //argument the map of employees for the target province
    public static Employee leastPaidEmployee(String province, Map<Integer, Employee> map) {

        //INSERT YOUR CODE HERE - study how allEmployees(...) is being implemented
        int i = 0;
        Map<Integer, Employee> empMap = new Hashtable<Integer, Employee>();
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            Employee least = entry.getValue();
            if (i == 0) {
                leastPaidEmployee = least;
                i++;
            } else {
                if (least.getIncome() < leastPaidEmployee.getIncome()) {
                    leastPaidEmployee = least;
                    i++;
                }
            }
        }
        return leastPaidEmployee;
    }

    //argument the map of employees for the target province
    public static Employee highestPaidEmployee(String province, Map<Integer, Employee> map) {
        //INSERT YOUR CODE HERE - see how allEmployees(...) is being implemented below. You may even reuse the code as well
        int i = 0;
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            Employee largest = entry.getValue();
            if (i == 0) {
                highestPaidEmployee = largest;
                i++;
            } else {
                if (largest.getIncome() > highestPaidEmployee.getIncome()) {
                    highestPaidEmployee = largest;
                    i++;
                }
            }
        }

        return highestPaidEmployee;
    }

    //computes a list of all employees by their province of residence
    public static Map<Integer, Employee> allEmployeesOf(String province, Map<Integer, Employee> map) {

        province = Utility.formatProvince(province);
        Map<Integer, Employee> empMap = new Hashtable<Integer, Employee>();
        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {

            int key = entry.getKey();
            Employee value = (Employee) entry.getValue();
            if (value.getProvince().equals(province)) {
                empMap.put(key, value);
            }
        }
        return empMap;
    }
}