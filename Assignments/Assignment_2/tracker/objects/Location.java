/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.objects;

public class Location {

    double longitude, latitude;

    public Location() {

        longitude = 0.0;
        latitude = 0.0;
    }

    public Location(double longitude, double latitude) {

        this.latitude = latitude;
        this.longitude = longitude;

    }

    public double getLongitude() {

        return longitude;
    }

    public double getLatitude() {

        return latitude;
    }

    public void setLongitude(double longitude) {

        this.longitude = longitude;
    }

    public void setLatitude(double latitude) {

        this.latitude = latitude;
    }

    public boolean equals(Location other) {

        /**
         * Here we use the getters to verify that the
         *  variables are the same for quality assurance.*/
        return other.latitude == this.latitude && other.longitude == this.longitude;
    }

    public String toString() {

        /**
         * Here we prepare our longitude and latitude for output
         */
        return "Located at: [longitude: " + this.getLongitude() + ", latitude: " + this.getLatitude() + "]";

    }
}