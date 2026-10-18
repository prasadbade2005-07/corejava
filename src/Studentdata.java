

import java.util.Objects;

public class Studentdata {

    // Instance variables
    private int id;
    private String name;

    // Constructor
    public Studentdata(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // hashCode() method
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // toString() method
    @Override
    public String toString() {
        return "Student ID: " + id + ", Student Name: " + name;
    }

    public static void main(String[] args) {

        Studentdata s1 = new Studentdata(101, "Prasad");
        Studentdata s2 = new Studentdata(102, "Ravi");

        // Calling hashCode()
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        // Calling toString()
        System.out.println(s1);
        System.out.println(s2);
    }
}