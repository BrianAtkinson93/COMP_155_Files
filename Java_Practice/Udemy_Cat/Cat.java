public class Cat {
    String name;
    String furColour;
    int age;


    Cat() {
        this.name = "Devil";
        this.age = 3;
        this.furColour = "black";
    }


    Cat(String name, int age) {
        this(name, age, "grey");
//        this.name = name;
//        this.age = age;
//        this.furColour = "grey";
    }


    Cat(String name, int age, String furColour) {
        this.name = name;
        this.age = age;
        this.furColour = furColour;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", furColour='" + furColour + '\'' +
                ", age=" + age +
                '}';
    }
}
