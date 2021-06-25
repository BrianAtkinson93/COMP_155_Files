/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.objects;

public class Address {

    private int unit, streetNumber;
    private String streetName, postalCode, city, province;
    public enum Type { BUSINESS, OFFICE, HOME }
    Type type;

    //Constructors
    public Address() {
        //INSERT YOUR CODE HERE
    }

    public Address( int streetNumber, String streetName, String postalCode, String city, String province, Type type ) {
        //INSERT YOUR CODE HERE
        unit = 0;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
        this.type = type;
    }

    public Address( int unit, int streetNumber, String streetName, String postalCode, String city, String province, Type type ) {
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
        //INSERT YOUR CODE HERE
        return streetNumber;
    }

    public int getUnit() {

        //INSERT YOUR CODE HERE
        return unit;
    }

    public String getType() {
        return typeToString();
    }

    public String getStreetName() {
        //INSERT YOUR CODE HERE
        return streetName;
    }

    public String getPostalCode() {
        //INSERT YOUR CODE HERE
        return postalCode;
    }

    public String getCity() {
        //INSERT YOUR CODE HERE
        return city;
    }

    public String getProvince() {
        //INSERT YOUR CODE HERE
        return province;
    }

    public void setStreetNumber( int number ) {
        //INSERT YOUR CODE HERE
        this.streetNumber = number;
    }

    public void setUnit( int unit ) {
        //INSERT YOUR CODE HERE
        this.unit = unit;
    }

    public void setStreetName( String name ) {
        //INSERT YOUR CODE HERE
        this.streetName = name;
    }

    public void setPostalCode( String code ) {
        //INSERT YOUR CODE HERE
        this.postalCode = code;
    }

    public void setCity( String city ) {
        //INSERT YOUR CODE HERE
        this.city = city;
    }

    public void setProvince( String province ) {
        //INSERT YOUR CODE HERE
        this.province = province;
    }

    public void setType( Type type ) {
        //INSERT YOUR CODE HERE
        this.type = type;
    }

    private static String formatProvince( String provinceOrFederal ) {

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

    public boolean equals( Address address ) {
        //INSERT YOUR CODE HERE
        return false;
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return "" + type ;
    }
}