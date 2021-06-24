import java.util.Scanner

public class Test_Dog {

    public static void main(String[] args) throws IllegalAccessException {
        Dog myDog = new Dog("Dog", "black", 10);
        System.out.println(myDog);

        Dog whiteDog = new Dog("Dog two", "white", 15);
        System.out.println(whiteDog);

        Dog illegalDog = new Dog("Dog three", "purple", 0);
        System.out.println(illegalDog);

        Dog illegalDogTwo = new Dog("Dog four", "green", 1);
        System.out.println(illegalDogTwo);

        Scanner scan = new Scanner(System.in);
        String s = scan.();
    }


}
