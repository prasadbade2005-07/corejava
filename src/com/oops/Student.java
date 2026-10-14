
package com.oops;

// Class is a blueprint of an object
// Object is an instance of a class

public class Student {
    String name = "Prasad";
    int age = 22;

    void study() {
        System.out.println("The student is studying");
    }

    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.name);
        System.out.println(s.age);
        s.study();
    }
}
