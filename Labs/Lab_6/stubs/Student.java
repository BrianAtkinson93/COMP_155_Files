package stubs;

public class Student implements Comparable<Student> {

    private String name;
    private int studentNumber;
    private int age;

    public Student(String name, int studentNumber, int age) {
        //INSERT YOUR CODE HERE
        this.name = name;
        this.studentNumber = studentNumber;
        this.age = age;
    }

    public String getName() {
        //INSERT YOUR CODE HERE
        return name;
    }

    public int getStudentNumber() {
        //INSERT YOUR CODE HERE
        return studentNumber;
    }

    public int getAge() {
        //INSERT YOUR CODE HERE
        return age;
    }

    public void setName(String name) {
        //INSERT YOUR CODE HERE
        this.name = name;
    }

    public void setStudentNumber(int number) {
        //INSERT YOUR CODE HERE;
        this.studentNumber = number;
    }

    public void setAge(int age) {

        //INSERT YOUR CODE HERE
        this.age = age;
    }

    /**
     * This method checks to see if the variables
     * are the same; student numbers, ages and names
     * if they are then the boolean will return true
     * or else it will return false.
     * */
    public boolean equals(Student other) {
        //INSERT YOUR CODE HERE

        return this.studentNumber == other.getStudentNumber() && this.age == other.age && this.name.equals(other.name);
    }

    /**
     * Here I created a conditional situation where there is
     * a check to see if both names are the same length or
     *  if they are different lengths. IF they are the same
     *  then the method returns 0, IF it is less then it
     *    returns -1 and IF it is greater then it will
     *     return +1.
     *     */
    public int compareTo(Student other) {

        //INSERT YOUR CODE HERE
        return this.name.compareTo(other.name);
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return "Name: " + name + ", Student ID: " + studentNumber + ", Age: " + age;
    }
}