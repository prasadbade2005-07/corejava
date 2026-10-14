
package com.oops;

public class Details {
    String name;
    int age;

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Details s1 = new Details();
        Details s2 = new Details();

        s1.name = "Naveen";
        s1.age = 21;

        s2.name = "Ravi";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}
