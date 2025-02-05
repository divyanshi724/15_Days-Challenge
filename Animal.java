// Interface
public interface Animal {
    void sound();
}

// Class implementing the interface
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

// Another class implementing the same interface
public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}
