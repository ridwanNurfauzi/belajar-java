package oop;

class People {
    public String name;

    People(String name) {
        this.name = name;
    }

    public String greet() {
        return "Hello, good morning. My name is "+ this.name+'.';
    }
}
class Person extends People {
    Person(String name) {
        super(name);
    }

    public String greet() {
        return "Halo, selamat pagi. Nama saya "+ this.name+'.';
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        People rdwn1 = new People("rdwn1");
        System.out.println(rdwn1.greet());
        
        Person rdwn2 = new Person("rdwn2");
        System.out.println(rdwn2.greet());
    }
}
