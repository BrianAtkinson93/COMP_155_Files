/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

import java.util.Objects;

public class Address {

    private int unit, streetNumber;
    private String streetName, postalCode, city, province;

    public enum Type {BUSINESS, OFFICE, HOME}

    Type type;
    String country;

    //Constructors
    public Address() {
        //INSERT YOUR CODE HERE...
    }

    public Address(int streetNumber, String streetName, String postalCode, String city, String province, Type type, String country) {
        //INSERT YOUR CODE HERE...
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.type = type;
        this.country = country;
    }

    public Address(int unit, int streetNumber, String streetName, String postalCode, String city, String province, Type type, String country) {
        //INSERT YOUR CODE HERE...
        this.unit = unit;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.type = type;
        this.country = country;
    }

    //Accessor methods
    public int getStreetNumber() {
        //INSERT YOUR CODE HERE...
        return streetNumber;
    }

    public int getUnit() {
        //INSERT YOUR CODE HERE...
        return unit;
    }

    public Type getType() {
        //INSERT YOUR CODE HERE...
        return type;
    }

    public String getStreetName() {
        //INSERT YOUR CODE HERE...
        return streetName;
    }

    public String getPostalCode() {
        //INSERT YOUR CODE HERE...
        return postalCode;
    }

    public String getCity() {
        //INSERT YOUR CODE HERE...
        return city;
    }

    public String getProvince() {
        //INSERT YOUR CODE HERE...
        return province;
    }

    public String getCountry() {
        //INSERT YOUR CODE HERE...
        return country;
    }

    public void setStreetNumber(int number) {
        //INSERT YOUR CODE HERE...
        this.streetNumber = number;
    }

    public void setUnit(int number) {
        //INSERT YOUR CODE HERE...
        this.unit = number;
    }

    public void setStreetName(String name) {
        //INSERT YOUR CODE HERE...
        this.streetName = name;
    }

    public void setPostalCode(String code) {
        //INSERT YOUR CODE HERE...
        this.postalCode = code;
    }

    public void setCity(String city) {
        //INSERT YOUR CODE HERE...
        this.city = city;
    }

    public void setProvince(String province) {
        //INSERT YOUR CODE HERE...
        this.province = province;
    }

    public void setCountry(String country) {
        //INSERT YOUR CODE HERE...
        this.country = country;
    }


    public void setType(Type type) {
        //INSERT YOUR CODE HERE...
        this.type = type;
    }

    private static String formatProvince(String provinceOrFederal) {

        provinceOrFederal = provinceOrFederal.toLowerCase();
        switch (provinceOrFederal) {
            case "ontario":
            case "on":
                return "ON";
            case "Manitoba":
            case "mb":
                return "MB";
            case "british columbia":
            case "bc":
                return "BC";
            case "new brunswick":
            case "nb":
                return "NB";
            case "alberta":
            case "ab":
                return "AB";
            case "saskatchewan":
            case "sk":
                return "SK";
            case "nova scotia":
            case "ns":
                return "NS";
            case "quebec":
            case "qc":
                return "QC";
            default:
                return "federal";
        }
    }

    private String typeToString() {

        switch (this.type) {
            case BUSINESS:
                return "BUSINESS";
            case OFFICE:
                return "OFFICE";
            case HOME:
                return "HOME";
            default:
                return "";
        }
    }

    // Here i implement a conditional statement...
    // IF the address contains a unit number then do this,
    // otherwise do this. I do this for homes without unit numbers
    public boolean equals(Address address) {
        //INSERT YOUR CODE HERE...
        if (this.getUnit() == 0) {
            return address.getStreetNumber() == this.getStreetNumber() && Objects.equals(address.getStreetName(), this.getStreetName()) && Objects.equals(this.getPostalCode(), address.getPostalCode()) && Objects.equals(this.getCity(), address.getCity()) && Objects.equals(this.getProvince(), address.getProvince()) && this.getType() == address.getType() && Objects.equals(this.getCountry(), address.getCountry());
        } else {
            return address.getUnit() == this.getUnit() && address.getStreetNumber() == this.getStreetNumber() && Objects.equals(address.getStreetName(), this.getStreetName()) && Objects.equals(this.getPostalCode(), address.getPostalCode()) && Objects.equals(this.getCity(), address.getCity()) && Objects.equals(this.getProvince(), address.getProvince()) && this.getType() == address.getType() && Objects.equals(this.getCountry(), address.getCountry());
        }
    }


    public String toString() {
        //INSERT YOUR CODE HERE...
        if (this.getUnit() == 0)
            return this.getType() + ": " + this.getStreetNumber() + ", " + this.getStreetName() + ", " + this.getCity() + ", " + formatProvince(this.getProvince()) + " " + this.getPostalCode() + ", " + this.getCountry();
        else
            return this.getType() + ": " + this.getUnit() + "-" + this.getStreetNumber() + ", " + this.getStreetName() + ", " + this.getCity() + ", " + formatProvince(this.getProvince()) + " " + this.getPostalCode() + ", " + this.getCountry();
    }
}