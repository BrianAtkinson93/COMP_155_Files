package com.company;

public class User {
    private String _name;
    private String _membership;

    void set_membership(String membership) {
        _membership = membership;
    }

    String get_membership() {
        System.out.println("Membership Level: ");
        return _membership;
    }

    void set_name(String name) {
        System.out.println("Logging into file... ");
        System.out.println();
        System.out.println("Username: ");
        _name = name;
    }

    String get_name() {
        return _name;
    }
}
