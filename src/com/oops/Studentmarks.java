package com.oops;


public class Studentmarks {

    // Class variable
    static String college = "SASI";

    // Instance variables
    int id;
    String name;

    // Constructor
    Studentmarks(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        // Local variable
        int marks = 90;

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("College: " + college);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Studentmarks s1 = new Studentmarks(101, "Prasad");
        Studentmarks s2 = new Studentmarks(102, "Ravi");

        s1.display();
        s2.display();
    }
}
