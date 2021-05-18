package com.company;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.set_name("Brian");
        user.set_membership("Platinum");

        System.out.println(user.get_name());
        System.out.println();
        System.out.println(user.get_membership());


    }
}
