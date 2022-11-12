package oop;

class Person {
    // Property
    public String firstName;
    private String lastName;
    protected String fullName;

    // Methode
    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
    }
}

public class Struktur {
    public static void main(String[] args) {
        // Object
        Person person = new Person("ridwan", "Nurfauzi");

        System.out.println("first name : " + person.firstName +
                "\nfull name : " + person.fullName);
    }
}
