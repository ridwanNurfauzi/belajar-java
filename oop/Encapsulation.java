package oop;

class People{
    // public berarti dapat diakses siapapun
    public String firstName;

    // private berarti hanya dapat diakses di dalam kelas itu sendiri
    private String lastName;

    // protected berarti hanya dapat diakses di dalam kelas itu sendiri dan di dalam kelas turunannya
    protected String fullName;

    People(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName+ " "+ lastName;
    }
}

class Person extends People {
    private String lastName;

    Person(String firstName, String lastName){
        super(firstName, lastName);
        this.lastName = lastName;
        this.fullName = firstName+ " "+ lastName;
    }

    public void showName(){
        System.out.println("First Name : "+this.firstName);
        System.out.println("Last Name : "+this.lastName);
        System.out.println("Full Name : "+this.fullName);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person("Ridwan", "Nurfauzi");

        person.showName();
    }
}
