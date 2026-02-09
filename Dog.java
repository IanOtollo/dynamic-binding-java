class Dog {
    public void bark() {
        System.out.println("Dog makes a sound - barking");
    }
}

class Puppy extends Dog {
    @Override
    public void bark() {
        System.out.println("Puppy barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Puppy();   
        dog.bark();              
    }
}
