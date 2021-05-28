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
            return switch (provinceOrFederal) {
                case "AB" -> alberta();
                case "BC" -> britishColumbia();
                case "MB" -> manitoba();
                case "NB" -> newBrunswick();
                case "NS" -> novaScotia();
                case "ON" -> ontario();
                case "SK" -> saskatchewan();
                default -> federal();
            };
        }

        //declares the categories for the province of Manitoba
        public static Map<Integer, TaxCategory> manitoba() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                TaxCategory cat1 = new TaxCategory(10.8, 0, 33_723);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(12.75, 33_723.01, 72_885);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(17.4, 72_885.01, 10_000_000);
                categories.put(3, cat3);
            } catch (Exception e) {
                System.out.println("Something went wrong in Government.manitoba()");
            }

            return categories;
        }

        //declares the categories for the province of Alberta
        public static Map<Integer, TaxCategory> alberta() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(10, 0, 131_220);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(12, 131_220.01, 157_464);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(13, 157_464.01, 209_952);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(14, 209_952.01, 314_928);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(15, 314_928.01, 10_000_000);
                categories.put(5, cat5);
            } catch (Exception e) {
                System.out.println("Something went wrong in Government.alberta()");
            }

            return categories;
        }

        //declares the categories for the province of British Columbia
        public static Map<Integer, TaxCategory> britishColumbia() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE
                //You will need to study how Manitoba is being implemented

                TaxCategory cat1 = new TaxCategory(5.06, 0, 42_184);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(7.7, 42_184.01, 84_369);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(10.5, 84_369.01, 96_866);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(12.29, 96_866.01, 117_623);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(14.7, 117_623.01, 159_483);
                categories.put(5, cat5);
                TaxCategory cat6 = new TaxCategory(16.8, 159_483.01, 222_420);
                categories.put(6, cat6);
                TaxCategory cat7 = new TaxCategory(20.5, 222_420.01, 10_000_000);
                categories.put(7, cat7);
            } catch (Exception e) {
                System.out.println("Something went wrong in Government.britishColumbia()");
            }

            return categories;
        }

        //declares the categories for the province of New Brunswick
        public static Map<Integer, TaxCategory> newBrunswick() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(9.68, 0, 43_835);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(14.82, 43_835.01, 87_671);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(16.52, 87_671.01, 142_534);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(17.84, 142_534.01, 162_383);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(20.3, 162_383.01, 10_000_000);
                categories.put(5, cat5);
            } catch (Exception e) {
                System.out.println("Something went wrong in Government.newBrunswick()");
            }

            return categories;
        }

        //declares the categories for the province of Nova Scotia
        public static Map<Integer, TaxCategory> novaScotia() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(8.79, 0, 29_590);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(14.95, 29_590.01, 59_180);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(16.67, 59_180.01, 93_000);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(17.5, 93_000.01, 150_000);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(21.0, 150_000.01, 10_000_000);
                categories.put(5, cat5);

            } catch (Exception e) {
                System.out.println("Something went wrong in GovernmentTax.novaScotia()");
            }

            return categories;
        }

        //declares the categories for the province of Ontario
        public static Map<Integer, TaxCategory> ontario() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(5.05, 0, 44_740);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(9.15, 44_740.01, 89_482);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(11.16, 89_482.01, 150_000);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(12.16, 150_000.01, 220_000);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(13.16, 220_000.01, 10_000_000);
                categories.put(5, cat5);

            } catch (Exception e) {
                System.out.println("Something went wrong in GovernmentTax.ontario()");
            }

            return categories;
        }

        //declares the categories for the province of saskatchewan
        public static Map<Integer, TaxCategory> saskatchewan() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(10.5, 0, 45_677.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(12.5, 45_677.01, 130_506.00);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(13.16, 130_506.01, 10_000_000);
                categories.put(3, cat3);
            } catch (Exception e) {
                System.out.println("Something went wrong in GovernmentTax.saskatchewan()");
            }

            return categories;
        }

        //declares the categories for the federal government
        public static Map<Integer, TaxCategory> federal() {

            HashMap<Integer, TaxCategory> categories = new HashMap<Integer, TaxCategory>();
            try {
                //INSERT YOUR CODE HERE
                //You will need to study how Manitoba is being implemented
                TaxCategory cat1 = new TaxCategory(15, 0, 49_020.00);
                categories.put(1, cat1);
                TaxCategory cat2 = new TaxCategory(20.5, 49_020.01, 98_040);
                categories.put(2, cat2);
                TaxCategory cat3 = new TaxCategory(26, 98_040.01, 151_978);
                categories.put(3, cat3);
                TaxCategory cat4 = new TaxCategory(29, 151_978.01, 216_511);
                categories.put(4, cat4);
                TaxCategory cat5 = new TaxCategory(33, 216_511.01, 10_000_000);
                categories.put(5, cat5);

            } catch (Exception e) {
                System.out.println("Something went wrong in GovernmentTax.federal()");
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
        double totalTax = 0;
        double taxableAmount = 0;
        TaxCategory[] taxCategories = new TaxCategory[7];
        taxCategories[0] = categories.get(7);
        taxCategories[1] = categories.get(6);
        taxCategories[2] = categories.get(5);
        taxCategories[3] = categories.get(4);
        taxCategories[4] = categories.get(3);
        taxCategories[5] = categories.get(2);
        taxCategories[6] = categories.get(1);

        for (TaxCategory taxCat : taxCategories) {
            if (taxCat != null) {
                if (income > taxCat.getLowerBound()) {
                    if (taxCat.getUpperBound() >= income) // first tax category to tax
                        taxableAmount += income - taxCat.getLowerBound();
                    else
                        taxableAmount += taxCat.getUpperBound() - taxCat.getLowerBound();
                    totalTax += (taxCat.getPercentage() / 100) * taxableAmount;
                    taxableAmount = 0;
                }
            }
        }

            return totalTax;
        }

        public double getAmount () {
            return Math.round(computeAmount() * 100.0) / 100.0;
        }

        public boolean isProvincial () {
            return isProvincial;
        }
    }