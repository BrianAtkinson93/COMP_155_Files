/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.objects;

public class Location {

    double longitude, latitude;

    public Location() {
        //INSERT YOUR CODE
        longitude = 0.0;
        latitude = 0.0;
    }


    public Location( double longitude, double latitude ) {
        //INSERT YOUR CODE
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public double getLongitude() {
        //INSERT YOUR CODE
        return longitude;
    }

    public double getLatitude() {
        //INSERT YOUR CODE
        return latitude;
    }

    public void setLongitude( double longitude ) {
        //INSERT YOUR CODE
        this.longitude = longitude;
    }

    public void setLatitude( double latitude ) {
        //INSERT YOUR CODE
        this.latitude = latitude;
    }

    public boolean equals( Location other ) {

        //INSERT YOUR CODE
        return false;
    }

    public String toString() {
        //INSERT YOUR CODE
        return "Located at: [longitude: " + longitude + ", latitude: " + latitude + "]";

    }
}