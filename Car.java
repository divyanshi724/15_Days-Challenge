// Define a class called 'Car'
class Car {
    // Fields (attributes) of the class
    String make;
    String model;
    int year;
    
    // Constructor to initialize the fields
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Method (behavior) of the class
    public void displayInfo() {
        System.out.println("Car Info: " + year + " " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an object (instance) of the Car class
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Access the methods using the objects
        car1.displayInfo();  // Output: Car Info: 2020 Toyota Corolla
        car2.displayInfo();  // Output: Car Info: 2022 Honda Civic
    }
}
