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

        public static Map<Integer, TaxCategory> getEmployeeCategories(String provinceOrFederal) {

            provinceOrFederal = Utility.formatProvince(provinceOrFederal.toLowerCase());
            switch (provinceOrFederal) {
                case "AB":
                    return alberta();
                case "BC":
                    return britishColumbia();
                case "MB":
                    return manitoba();
                case "NB":
                    return newBrunswick();
                case "NS":
                    return novaScotia();
                case "ON":
                    return ontario();
                case "SK":
                    return saskatchewan();
                default:
                    return federal();
            }
        }

        //declares the catgeroies for the province of Manitoba
        public static Map<Integer, TaxCategory> manitoba() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                TaxCategory cat1 = new TaxCategory(10.8, 0, 33723.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(12.75, 33723.01, 72885.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(17.4, 72885.01, 100_000_000.00);
                categories.put(3, cat3);
            } catch (Exception e) {
            }

            return categories;
        }

        //declares the catgeroies for the province of Alberta
        public static Map<Integer, TaxCategory> alberta() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE - Using the specification given on Federal
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(10.00, 0, 131_220.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(12.00, 131_220.01, 157_464.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(13.00, 157_464.01, 209_952.00);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(14.00, 209_952.01, 314_928.00);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(15.00, 314_928.01, 100_000_000.00);
                categories.put(5, cat5);
            } catch (Exception e) {
            }

            return categories;
        }

        //declares the catgeroies for the province of Quebec
        public static Map<Integer, TaxCategory> britishColumbia() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE - Using the specification given on Federal
                //You will need to study how Manitoba is being implemented

                TaxCategory cat1 = new TaxCategory(5.06, 0, 42_184.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(7.70, 42_184.01, 84_369.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(10.50, 84_369.01, 96_866.00);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(12.29, 96_866.00, 117_623.00);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(14.70, 117_623.01, 159_483.00);
                categories.put(5, cat5);
                TaxCategory cat6 = new TaxCategory(16.80, 159_483.01, 222_420.00);
                categories.put(6, cat6);
                TaxCategory cat7 = new TaxCategory(20.50, 222_420.01, 100_000_000.00);
                categories.put(7, cat7);
            } catch (Exception e) {
            }

            return categories;
        }

        //declares the catgeroies for the province of New Brunswick
        public static Map<Integer, TaxCategory> newBrunswick() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE - Using the specification given on Federal
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(9.65, 0, 43_835.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(14.82, 43_835.01, 87_671.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(16.52, 87_671.01, 142_534.00);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(17.84, 142_534.01, 162_383.00);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(20.30, 162_383.01, 100_000_000.00);
                categories.put(5, cat5);
            } catch (Exception e) {
            }

            return categories;
        }

        //declares the catgeroies for the province of Nova Scotia
        public static Map<Integer, TaxCategory> novaScotia() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE - Using the specification given on Federal
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(8.79, 0, 29_590.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(14.95, 29_590.01, 59_180.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(16.67, 59_180.01, 93_000.00);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(17.50, 93_000.01, 150_000.00);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(21.00, 150_000.01, 100_000_000.00);
                categories.put(5, cat5);

            } catch (Exception e) {
            }

            return categories;
        }

        //declares the catgeroies for the province of Ontario
        public static Map<Integer, TaxCategory> ontario() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE - Using the specification given on Federal
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(5.05, 0, 44_740.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(9.15, 44_470.01, 89_482.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(11.16, 89_482.01, 150_000.00);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(12.16, 150_000.01, 220_000.00);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(13.16, 220_000.01, 100_000_000.00);
                categories.put(5, cat5);

            } catch (Exception e) {
            }

            return categories;
        }

        //declares the catgeroies for the province of saskatchewan
        public static Map<Integer, TaxCategory> saskatchewan() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE - Using the specification given on Federal
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(10.50, 0, 45_677.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(12.50, 45_677.01, 130_506.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(13.16, 130_506.01, 100_000_000.00);
                categories.put(3, cat3);
            } catch (Exception e) {
            }

            return categories;
        }

        //declares the catgeroies for the federal government
        public static Map<Integer, TaxCategory> federal() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE - Using the specification given on Federal
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(15.00, 0, 49_020.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(20.50, 49_020.01, 98_040.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(26.00, 98_040.01, 151_978.00);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(29.00, 151_978.01, 216_511.00);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(33.00, 216_511.01, 100_000_000.00);
                categories.put(5, cat5);

            } catch (Exception e) {
            }

            return categories;
        }

    }

    private Map<Integer, TaxCategory> categories;

    public GovernmentTax(Employee employee, String provinceOrFederal) {

        super(employee);
        String province = provinceOrFederal;
        if (!(provinceOrFederal.equals("federal") || provinceOrFederal.equals("fed"))) {
            province = employee.getProvince();
            isProvincial = true;
        }
        this.categories = TaxUtil.getEmployeeCategories(province);
    }

    public double computeAmount() {

        double income = employee.getIncome();
        //INSERT YOUR CODE HERE


        return 0.0;
    }

    public double getAmount() {
        return Math.round(computeAmount() * 100.0) / 100.0;
    }

    public boolean isProvincial() {
        return isProvincial;
    }
}