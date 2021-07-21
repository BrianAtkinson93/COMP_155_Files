/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/


package canadian;

import canadian.DataScience;
import canadian.payroll.Employee;
import canadian.file.CSVReader;

import java.util.*;

import canadian.payroll.*;
import canadian.Utility;

public class Utility {

    //Computes deductions (taxes, cpp, ei, health premium) per employee
    public static List<Deduction> computeDeductions(Employee employee) {

        GovernmentTax federalTax = new GovernmentTax(employee, "federal");
        GovernmentTax provincialTax = new GovernmentTax(employee, employee.getProvince());
        //OverallTax overallTax = new OverallTax( employee, provincialTax );
        EI ei = new EI(employee);
        CPP cpp = new CPP(employee);
        HealthPremium hp = new HealthPremium(employee);

        List<Deduction> deductions = new ArrayList<Deduction>();
        deductions.add(federalTax);
        deductions.add(provincialTax);
        deductions.add(ei);
        deductions.add(cpp);
        deductions.add(hp);

        return deductions;
    }

    //Formats province into its 2-character representation
    public static String formatProvince(String provinceOrFederal) {

        provinceOrFederal = provinceOrFederal.toLowerCase();
        return switch (provinceOrFederal) {
            case "ontario", "on" -> "ON";
            case "manitoba", "mb" -> "MB";
            case "British Columbia", "bc" -> "BC";
            case "new brunswick", "nb" -> "NB";
            case "alberta", "ab" -> "AB";
            case "saskatchewan", "sk" -> "SK";
            case "nova scotia", "ns" -> "NS";
            default -> "federal";
        };
    }

    //displays on the screen one of the least paid employees by their province of residence
    public static void leastPaidEmployees(Map<Integer, Employee> map) {

        System.out.println("........................................................................................................................");
        System.out.println("........................................................ Least Paid Employees ..........................................");
        System.out.println("........................................................................................................................");
        Map<Integer, Employee> employees = DataScience.allEmployeesOf("sk", map);
        //printMap(employees);
        System.out.println(DataScience.leastPaidEmployee("sk", employees));
        employees = DataScience.allEmployeesOf("on", map);
        //printMap(employees);
        System.out.println(DataScience.leastPaidEmployee("on", employees));
        employees = DataScience.allEmployeesOf("mb", map);
        //printMap(employees);
        System.out.println(DataScience.leastPaidEmployee("mb", employees));
        employees = DataScience.allEmployeesOf("ns", map);
        //printMap(employees);
        System.out.println(DataScience.leastPaidEmployee("ns", employees));
        employees = DataScience.allEmployeesOf("bc", map);
        //printMap(employees);
        System.out.println(DataScience.leastPaidEmployee("bc", employees));
        employees = DataScience.allEmployeesOf("ab", map);
        //printMap(employees);
        System.out.println(DataScience.leastPaidEmployee("ab", employees));
        employees = DataScience.allEmployeesOf("nb", map);
        //printMap(employees);
        System.out.println(DataScience.leastPaidEmployee("nb", employees));
    }

    //displays on the screen one of the highest paid employees by their province of residence
    public static void highestPaidEmployees(Map<Integer, Employee> map) {

        System.out.println("........................................................................................................................");
        System.out.println("...................................................... Highest Paid Employees ..........................................");
        System.out.println("........................................................................................................................");
        Map<Integer, Employee> employees = DataScience.allEmployeesOf("sk", map);
        //printMap(employees);
        System.out.println(DataScience.highestPaidEmployee("sk", employees));
        employees = DataScience.allEmployeesOf("on", map);
        //printMap(employees);
        System.out.println(DataScience.highestPaidEmployee("on", employees));
        employees = DataScience.allEmployeesOf("mb", map);
        //printMap(employees);
        System.out.println(DataScience.highestPaidEmployee("mb", employees));
        employees = DataScience.allEmployeesOf("ns", map);
        //printMap(employees);
        System.out.println(DataScience.highestPaidEmployee("ns", employees));
        employees = DataScience.allEmployeesOf("bc", map);
        //printMap(employees);
        System.out.println(DataScience.highestPaidEmployee("bc", employees));
        employees = DataScience.allEmployeesOf("ab", map);
        //printMap(employees);
        System.out.println(DataScience.highestPaidEmployee("ab", employees));
        employees = DataScience.allEmployeesOf("nb", map);
        //printMap(employees);
        System.out.println(DataScience.highestPaidEmployee("nb", employees));
    }

    //displays employees stored in a given map
    public static void printMap(Map<Integer, Employee> map) {

        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println(map.get(entry.getKey()));
        }
    }

    //displays employees from a given CSV file
    public static void printEmployeeList(String fileName) {

        Map<Integer, Employee> map = CSVReader.gjavaetEmployees(fileName);
        printMap(map);
    }


    private static double points(int index) {

        //returns approriate grade points based on the test index
        double x = 0.5714285714285714;
        return switch (index) {
            case 0 -> 5 * x;
            case 1 -> 7 * x;
            case 2 -> 5 * x;
            case 3 -> 5 * x;
            case 4 -> 5 * x;
            case 5 -> 3 * x;
            case 6 -> 5 * x;
            case 7 -> 2.5;
            case 8 -> 2.5;
            case 9 -> 2.5;
            case 10 -> 2.5;
            case 11 -> 2.5;
            case 12 -> 2.5;
            case 13 -> 2.5;
            case 14 -> 2.5;
            case 15 -> 5;
            case 16 -> 5;
            case 17 -> 10;
            case 18 -> 10;
            case 19 -> 10;
            default -> 0;
        };
    }

    //this method computes students grade for this lab...
    public static void gradeLab(boolean[] test) {

        boolean flag = true;
        double totalPoints = 0;
        for (int i = 0; i < test.length; i++) {
            double points = Math.round(points(i) * 100.0) / 100.0;
            if (test[i]) {
                System.out.println("Test " + i + " (Q" + (i + 1) + ") passed. [Alloted point(s): " + points + "]");
                totalPoints += points(i);
            } else {
                System.out.println("Test " + i + " (Q" + (i + 1) + ") failed. [Alloted point(s): " + points + "]");
                flag = false;
            }
        }

        if (flag) {
            System.out.println("All tests are successful.");
        } else {
            System.out.println("Not all tests are successful.");
        }
        System.out.println("Total points earned in this lab: " + totalPoints + " points ");
    }
}