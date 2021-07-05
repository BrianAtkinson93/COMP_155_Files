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

    public boolean equals(Student other) {
        //INSERT YOUR CODE HERE

        return this.studentNumber == other.getStudentNumber() && this.age == other.age && this.name.equals(other.name);
    }

    public int compareTo(Student other) {

        //INSERT YOUR CODE HERE
        String name1 = this.getName();
        String name2 = other.getName();

        if( name1.equals(name2))
            return 0;
        else if( name1.length() > name2.length())
            return -1;
        else if (name2.length() > name1.length())
            return +1;
        return 0;
    }

    public String toString() {
        //INSERT YOUR CODE HERE
        return "Name: " + name + ", Student ID: " + studentNumber + ", Age: " + age;
    }
}