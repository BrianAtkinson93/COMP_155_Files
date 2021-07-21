/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

public class Location {

    //instance variables
    double longitude, latitude;

    //default constructor
    public Location() {
        //INSERT YOUR CODE HERE...
        this.longitude = 0.0;
        this.latitude = 0.0;
    }

    //parameterized constructor
    public Location(double longitude, double latitude) {
        //INSERT YOUR CODE HERE...
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        //INSERT YOUR CODE HERE...
        return longitude;
    }

    public double getLatitude() {
        //INSERT YOUR CODE HERE...
        return latitude;
    }

    public void setLongitude(double longitude) {
        //INSERT YOUR CODE HERE...
        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {
        //INSERT YOUR CODE HERE...
        this.latitude = latitude;
    }

    public boolean equals(Location other) {

        //INSERT YOUR CODE HERE...

        return other.longitude == this.longitude && other.latitude == this.latitude;
    }

    public String toString() {
        return "Located at: [longitude: " + longitude + ", latitude: " + latitude + "]";
    }
}