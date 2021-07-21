/*Code Authored by:
 ***Dr. Opeyemi Olusegun Adesina
 ***School of Computing, University of the Fraser Valley, Abbotsford - Canada
 ***All rights reserved - For reuse purposes, please contact Dr. Adesina at [opeyemi.adesina@ufv.ca]
 **/

import java.util.*;

public class Person {

    private int identity;
    private String name;
    private double age;
    private Sex sex;
    private List<Address> addresses = new ArrayList<>();
    private Status status;
    private Location location = new Location();

    //constructors
    public Person() {
        name = null;
        age = 0.0;
        sex = Sex.UNKNOWN;
        status = Status.UNKNOWN;
        identity = 0;
    }

    public Person(int identity, String name, double age, Sex sex, Status status, List<Address> addresses, Location location) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.addresses = addresses;
        this.status = status;
        this.identity = identity;
        this.location = location;
    }


    //Implementations of accessor methods
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Status getStatus() {
        return status;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public int getIdentity() {
        return identity;
    }

    public Location getLocation() {
        //INSERT YOUR CODE HERE...
        return location;
    }

    public void setName(String name) {
        //INSERT YOUR CODE HERE...
        this.name = name;
    }

    public void setAge(double age) {
        //INSERT YOUR CODE HERE...
        this.age = age;
    }

    public void setSex(Sex sex) {
        //INSERT YOUR CODE HERE...
        this.sex = sex;
    }

    public void setStatus(Status status) {
        //INSERT YOUR CODE HERE...
        this.status = status;
    }

    public void setAddresses(List<Address> addresses) {
        //INSERT YOUR CODE HERE...
        this.addresses = addresses;
    }

    public void setIdentity(int identity) {
        //INSERT YOUR CODE HERE...
        this.identity = identity;
    }

    public void setLocation(Location location) {
        //INSERT YOUR CODE HERE...
        this.location = location;
    }

    public enum Status {
        POSITIVE, NEGATIVE, SYMPTOMATIC, ASYMPTOMATIC, UNKNOWN
    }

    public enum Sex {
        MALE, FEMALE, UNKNOWN
    }

    public boolean equals(Person person) {

        //INSERT YOUR CODE HERE...
        return person.getName() == this.name && person.getAge() == this.age && person.getStatus().equals(this.getStatus()) && person.getSex().equals(this.getSex()) && person.getAddresses().toString().equals(this.getAddresses().toString());
    }

    /**
     * Takes an operational radius and all the people in the community as arguments
     * **Checks if this person (say p) is COVID-19 positive or asymptomatic and computes the list of everyone
     * in the neighbourhood that should be notified (or given an order).
     * <p>
     * Person at location (x,y) is in the neighbourhood (i.e., in an operational radius - rad)
     * of person at location (xn, yn) if the following holds, if:
     * - 'rec' be the bounding rectangle of circle with center point (x,y)
     * - 'rad' is the operational radius
     * - 'topLeft' and 'bottomRight' be the top-left and 'bottomRight' corner points of rec
     * - x1, x2 are the longitudes of bottomLeft and topRight corners respectively
     * - y1, y2 are the latitudes of bottomLeft and topRight corners respectively
     * <p>
     * Subject to:
     * y1 <= y <= y2 and x1 <= x <= x2										(1)
     * p is POSITIVE or p is ASYMPTOMATIC									(2)
     * <p>
     * <p>
     * ARGUMENTS:
     * operational radius
     * map of people in the community
     * RETURN:
     * A map of neighbors within an operating radius - mapping person
     * identity with the person (i.e., Map<Integer, Person>).
     **/
    public Map<Integer, Person> getNeighbours(double radius, Map<Integer, Person> allPersons) {

        Map<Integer, Person> neighbours = new HashMap<>();
        //INSERT YOUR CODE HERE...
        // If the status of the person is Positive or Asymptomatic
        // then we conduct the if loop of finding their neighbours
        if(this.getStatus() == Status.POSITIVE || this.getStatus() == Status.ASYMPTOMATIC) {

            double rightBound = this.getLocation().getLatitude() + radius;
            double leftBound = this.getLocation().getLatitude() - radius;
            double topBound = this.getLocation().getLongitude() + radius;
            double bottomBound =this.getLocation().getLongitude() - radius;


            for (Map.Entry<Integer, Person> entry : allPersons.entrySet()) {
                Location neighborLocation = entry.getValue().getLocation();
                if ((neighborLocation.getLongitude() <= topBound && neighborLocation.getLongitude() >= bottomBound) &&
                        (neighborLocation.getLatitude() <= rightBound && neighborLocation.getLatitude() >= leftBound) && (entry.getValue().getIdentity() != this.getIdentity())) {
                    neighbours.put(entry.getKey(), entry.getValue());
                }

            }
        }
        return neighbours;
    }

    public String toString() {

        //INSERT YOUR CODE HERE...
        StringBuilder s = new StringBuilder("\nID: " + identity + "\nFull Name: " + name + "\nAge: " + age + " years\nSex: " + sex + "\nCovid-19 Status: " + status + "\n" + getLocation() + "\nContact Address(es):");
        for (Address address : addresses) {
            s.append("\n").append(address.toString());
        }
        return s.toString();
    }
}
