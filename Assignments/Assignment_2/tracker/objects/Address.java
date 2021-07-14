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
    }


    public Address(int streetNumber, String streetName, String postalCode, String city, String province, Type type) {

        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.type = type;

    }

    public Address(int unit, int streetNumber, String streetName, String postalCode, String city, String province, Type type) {

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
        if( provinceOrFederal.equals( "ontario" ) || provinceOrFederal.equals( "on" ) ) {
            return "ON";
        } else if( provinceOrFederal.equals( "Manitoba" ) || provinceOrFederal.equals( "mb" ) ) {
            return "MB";
        } else if( provinceOrFederal.equals( "british columbia" ) || provinceOrFederal.equals( "bc" ) ) {
            return "BC";
        } else if( provinceOrFederal.equals( "new brunswick" ) || provinceOrFederal.equals( "nb" ) ) {
            return "NB";
        } else if( provinceOrFederal.equals( "alberta" ) || provinceOrFederal.equals( "ab" ) ) {
            return "AB";
        } else if( provinceOrFederal.equals( "saskatchewan" ) || provinceOrFederal.equals( "sk" ) ) {
            return "SK";
        } else if( provinceOrFederal.equals( "nova scotia" ) || provinceOrFederal.equals( "ns" ) ) {
            return "NS";
        } else if( provinceOrFederal.equals( "quebec" ) || provinceOrFederal.equals( "qc" ) ) {
            return "QC";
        } else {
            return "federal";
        }
    }

    private String typeToString() {

        switch( type ) {
            case BUSINESS : return "BUSINESS";
            case OFFICE : return "OFFICE";
            case HOME : return "HOME";
            default : return "";
        }
    }

    public boolean equals(Address address) {

        /**
        * Here we use the getters to verify that the
         * variables are the same for quality assurance.*/
        return address.getUnit() == this.unit && address.getStreetNumber() == this.streetNumber && address.getStreetName() == this.streetName && address.getPostalCode() == this.postalCode && address.getCity() == this.city && address.getProvince() == this.province && address.getType() == this.getType();
    }

    public String toString() {

        /**
         * Here we created a conditional statement to check if
         *  the address contains a unit number or not. Once the
         *   condition is established, either we return the address
         *    without a unit number or with a unit number
         */
        if (this.getUnit() == 0)
            return this.getType() + ": " + this.getStreetNumber() + ", " + this.getStreetName() + ", " + this.getCity() + ", " + formatProvince(this.getProvince()) + " " + this.getPostalCode();
        else
            return this.getType() + ": " + this.getUnit() + "-" + this.getStreetNumber() + ", " + this.getStreetName() + ", " + this.getCity() + ", " + formatProvince(this.getProvince()) + " " + this.getPostalCode();
    }
}