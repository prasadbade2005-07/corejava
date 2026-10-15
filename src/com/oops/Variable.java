package com.oops;
//Instance variable: Data that belongs to an individual object
//Static variable: Data shared by the class
//Local variable: Temporary data declared within a method, constructor, or block


public class Variable{
    int age = 21;                  // Instance variable
    static String college = "Sasi"; // Static variable

    void display() {
        int marks = 90;            // Local variable

        System.out.println(age);
        System.out.println(college);
        System.out.println(marks);
    }

    public static void main(String[] args) {
        Variable d = new Variable();
        d.display();
    }
}
