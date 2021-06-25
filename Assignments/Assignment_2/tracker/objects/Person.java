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
        identity = 0;
        name = "";
        age = 0.0;

    }

    public Person(int identity, String name, double age, Sex sex, Status status, List<tracker.objects.Address> addresses) {
        //INSERT YOUR CODE
        this.identity = identity;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.status = status;
        this.addresses = addresses;
    }


    //Implementations of accessor methods
    public String getName() {
        //INSERT YOUR CODE
        return name;
    }

    public double getAge() {
        //INSERT YOUR CODE
        return age;
    }

    public String getSex() {
        return sexToString();
    }

    public String getStatus() {
        return statusToString();
    }

    public List<tracker.objects.Address> getAddresses() {
        //INSERT YOUR CODE
        return addresses;
    }

    public int getIdentity() {
        //INSERT YOUR CODE
        return identity;
    }

    public void setName(String name) {
        //INSERT YOUR CODE
        this.name = name;
    }

    public void setAge(double age) {
        //INSERT YOUR CODE
        this.age = age;
    }

    public void setSex(Sex sex) {
        //INSERT YOUR CODE
        this.sex = sex;
    }

    public void setStatus(Status status) {
        //INSERT YOUR CODE
        this.status = status;
    }

    public void setAddresses(List<tracker.objects.Address> addresses) {
        //INSERT YOUR CODE
        this.addresses = addresses;
    }

    public void setIdentity(int identity) {
        //INSERT YOUR CODE
        this.identity = identity;
    }

    public enum Status {
        POSITIVE, NEGATIVE, SYMPTOMATIC, ASYMPTOMATIC, UNKNOWN
    }

    public enum Sex {
        MALE, FEMALE, UNKNOWN
    }

    private String sexToString() {

        return switch (sex) {
            case MALE -> "MALE";
            case FEMALE -> "FEMALE";
            default -> "UNKNOWN";
        };
    }

    private String statusToString() {

        return switch (status) {
            case POSITIVE -> "POSITIVE";
            case NEGATIVE -> "NEGATIVE";
            case SYMPTOMATIC -> "SYMPTOMATIC";
            case ASYMPTOMATIC -> "ASYMPTOMATIC";
            default -> "UNKNOWN";
        };
    }

    public boolean equals(Person person) {

        //INSERT YOUR CODE
        /**
         * Here we use the getters to verify that the
         *  variables are the same for quality assurance.*/
        return person.getName().equals(this.name) && person.getAge() == this.age && person.getStatus().equals(this.getStatus()) && person.getSex().equals(this.getSex()) && person.getAddresses().toString().equals(this.getAddresses().toString());
    }

    public String toString() {

        //INSERT YOUR CODE
        StringBuilder s = new StringBuilder("\nFULL NAME: " + name + "\nAge: " + age + " years\nSex: " + sex + "\nCovid-19 Status: " + status + "\nContact Address(es):");
        for (Address address : addresses) {
            s.append("\n").append(address.toString());
        }

        return s.toString();
    }
}