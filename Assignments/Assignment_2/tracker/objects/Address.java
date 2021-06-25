/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.objects;

public class Address {

    private int unit, streetNumber;
    private String streetName, postalCode, city, province;

    public enum Type {BUSINESS, OFFICE, HOME}

    Type type;

    //Constructors
    public Address() {
        //INSERT YOUR CODE HERE        this.type = Type.HOME;
    }

    public Address(int streetNumber, String streetName, String postalCode, String city, String province, Type type) {
        //INSERT YOUR CODE HERE
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.type = type;

    }

    public Address(int unit, int streetNumber, String streetName, String postalCode, String city, String province, Type type) {
        //INSERT YOUR CODE HERE
        this.unit = unit;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.type = type;
    }

    //Accessor methods
    public int getStreetNumber() {

        return streetNumber;
    }

    public int getUnit() {


        return unit;
    }

    public Type getType() {

        return type;
    }

    public String getStreetName() {

        return streetName;
    }

    public String getPostalCode() {

        return postalCode;
    }

    public String getCity() {

        return city;
    }

    public String getProvince() {

        return province;
    }

    public void setStreetNumber(int number) {

        this.streetNumber = number;
    }

    public void setUnit(int unit) {

        this.unit = unit;
    }

    public void setStreetName(String name) {

        this.streetName = name;
    }

    public void setPostalCode(String code) {

        this.postalCode = code;
    }

    public void setCity(String city) {

        this.city = city;
    }

    public void setProvince(String province) {

        this.province = province;
    }

    public void setType(Type type) {

        this.type = type;
    }

    private static String formatProvince(String provinceOrFederal) {

        provinceOrFederal = provinceOrFederal.toLowerCase();
        return switch (provinceOrFederal) {
            case "ontario", "on" -> "ON";
            case "Manitoba", "mb" -> "MB";
            case "british columbia", "bc" -> "BC";
            case "new brunswick", "nb" -> "NB";
            case "alberta", "ab" -> "AB";
            case "saskatchewan", "sk" -> "SK";
            case "nova scotia", "ns" -> "NS";
            case "quebec", "qc" -> "QC";
            default -> "federal";
        };
    }

    private String typeToString() {

        return switch (this.type) {
            case BUSINESS -> "BUSINESS";
            case OFFICE -> "OFFICE";
            case HOME -> "HOME";
        };
    }

    public boolean equals(Address address) {

        /**
        * Here we use the getters to verify that the
         * variables are the same for quality assurance.*/
        return address.getUnit() == this.unit && address.getStreetNumber() == this.streetNumber && address.getStreetName() == this.streetName && address.getPostalCode() == this.postalCode && address.getCity() == this.city && address.getProvince() == this.province && address.getType() == this.getType();
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return this.getType() + ": " + this.getUnit() + "-" + this.getStreetNumber() + ", " + this.getStreetName() + ", " + this.getCity() + ", " + formatProvince(this.getProvince()) + ", " + this.getPostalCode();
    }
}