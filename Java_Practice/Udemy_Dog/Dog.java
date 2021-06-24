public class Dog {
    private String name;
    private String furColour;
    private int age;

    public Dog(String name, String furColour, int age) throws IllegalAccessException {
        this.setName(name);
        this.setFurColour(furColour);
        this.setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        if (name.length() <= 1) {
            //enter message, instruction the user to set name greater than 2 character long
            throw new IllegalAccessException("The dog's name must be at least 2 characters long");
        } else {
            this.name = name;
        }
    }

    public String getFurColour() {
        return furColour;
    }

    public void setFurColour(String furColour) {
        this.furColour = furColour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalAccessException {
        if (age < 0) {
            throw new IllegalAccessException("The age should be positive!");
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", furColour='" + furColour + '\'' +
                ", age=" + age +
                '}';
    }
}
