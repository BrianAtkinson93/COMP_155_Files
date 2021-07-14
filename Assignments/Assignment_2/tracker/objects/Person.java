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
    private List<tracker.objects.Address> addresses = new ArrayList<>();
    private Status status = Status.UNKNOWN;

    //constructors
    public Person() {

        identity = 0;
        name = "";
        age = 0.0;

    }

    public Person(int identity, String name, double age, Sex sex, Status status, List<tracker.objects.Address> addresses) {

        this.identity = identity;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.status = status;
        this.addresses = addresses;
    }


    //Implementations of accessor methods
    public String getName() {

        return name;
    }

    public double getAge() {

        return age;
    }

    public String getSex() {
        return sexToString();
    }

    public String getStatus() {
        return statusToString();
    }

    public List<tracker.objects.Address> getAddresses() {

        return addresses;
    }

    public int getIdentity() {

        return identity;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(double age) {

        this.age = age;
    }

    public void setSex(Sex sex) {

        this.sex = sex;
    }

    public void setStatus(Status status) {

        this.status = status;
    }

    public void setAddresses(List<tracker.objects.Address> addresses) {

        this.addresses = addresses;
    }

    public void setIdentity(int identity) {

        this.identity = identity;
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

    public boolean equals(Person person) {

        /*
         * Here we use the getters to verify that the
         *  variables are the same for quality assurance.*/
        return person.getName().equals(this.name) && person.getAge() == this.age && person.getStatus().equals(this.getStatus()) && person.getSex().equals(this.getSex()) && person.getAddresses().toString().equals(this.getAddresses().toString());
    }

    public String toString() {
        /*
         * Here I used StringBuilder to format output and iterate each address
         *  associated with each in the list.
         */
        StringBuilder s = new StringBuilder("\nFULL NAME: " + name + "\nAge: " + age + " years\nSex: " + sex + "\nCovid-19 Status: " + status + "\nContact Address(es):");
        for (Address address : addresses) {
            s.append("\n").append(address.toString());
        }

        return s.toString();
    }
}