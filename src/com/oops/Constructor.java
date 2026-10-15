package com.oops;
//constructor is a special member of a class that initializes an object when it is created

class Constructor {

    int id;
    String name;

    Constructor () {
        id = 101;
        name = "Prasad";
    }

    public static void main(String[] args) {

        Constructor c = new Constructor();

        System.out.println(c.id);
        System.out.println(c.name);
    }
}
