/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

package tracker.objects;

import java.util.*;

public class Person {

    private int identity;
    private String name;
    private double age;
    private Sex sex = Sex.UNKNOWN;
    private List<tracker.objects.Address> addresses = new ArrayList<tracker.objects.Address>();
    private Status status = Status.UNKNOWN;

    //constructors
    public Person() {
        //INSERT YOUR CODE
    }

    public Person( int identity, String name, double age, Sex sex, Status status, List<tracker.objects.Address> addresses ) {
        //INSERT YOUR CODE
    }


    //Implementations of accessor methods
    public String getName() {
        //INSERT YOUR CODE
        return "";
    }

    public double getAge() {
        //INSERT YOUR CODE
        return 0.0;
    }

    public String getSex() {
        return sexToString();
    }

    public String getStatus() {
        return statusToString();
    }

    public List<tracker.objects.Address> getAddresses() {
        //INSERT YOUR CODE
        return null;
    }

    public int getIdentity() {
        //INSERT YOUR CODE
        return 0;
    }

    public void setName( String name ) {
        //INSERT YOUR CODE
    }

    public void setAge( double age ) {
        //INSERT YOUR CODE
    }

    public void setSex( Sex sex ) {
        //INSERT YOUR CODE
    }

    public void setStatus( Status status ) {
        //INSERT YOUR CODE
    }

    public void setAddresses( List<tracker.objects.Address> addresses ) {
        //INSERT YOUR CODE
    }

    public void setIdentity( int identity ) {
        //INSERT YOUR CODE
    }

    public enum Status {
        POSITIVE, NEGATIVE, SYMPTOMATIC, ASYMPTOMATIC, UNKNOWN
    }

    public enum Sex {
        MALE, FEMALE, UNKNOWN
    }

    private String sexToString() {

        switch( sex ) {
            case MALE : return "MALE";
            case FEMALE : return "FEMALE";
            default : return "UNKNOWN";
        }
    }

    private String statusToString() {

        switch( status ) {
            case POSITIVE : return "POSITIVE";
            case NEGATIVE : return "NEGATIVE";
            case SYMPTOMATIC : return "SYMPTOMATIC";
            case ASYMPTOMATIC : return "ASYMPTOMATIC";
            default : return "UNKNOWN";
        }
    }

    public boolean equals( Person person ) {

        //INSERT YOUR CODE
        return false;
    }

    public String toString() {

        //INSERT YOUR CODE
        return "";
    }
}