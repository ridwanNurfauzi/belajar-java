package oop;

// Animal class tidak dapat dipanggil secara langsung dan tidak dapat diobjekkan
abstract class Animal{
    public abstract void animalSound();

    public void sleep(){
        System.out.println("Zzz");
    }
}

// Animal class dapat dijadikan sebagai parent class
class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("Meow");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.animalSound();
        cat.sleep();
    }
}
