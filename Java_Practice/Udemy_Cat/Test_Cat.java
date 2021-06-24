public class Test_Cat {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.name = "Brian";
        myCat.age = 28;
        myCat.furColour = "Grey";

        System.out.println(myCat);
        System.out.println(myCat.name);
        System.out.println(myCat.age);
        System.out.println(myCat.furColour);

        Cat tomCat = new Cat();
        System.out.println("Fur Colour: " + tomCat.furColour);
        System.out.println("Name: " + tomCat.name);
        System.out.println("Age: " + tomCat.age);

        Cat devilCat = new Cat();
        System.out.println(devilCat);

        Cat blackcat = new Cat("Blacky", 5);
        System.out.println(blackcat);

        Cat greyCat = new Cat("Fluffy", 6);
        System.out.println(greyCat);


    }
}
