// Parent Class

class Vehicle {

    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void display() {
        System.out.println("Brand = " + brand);
        System.out.println("Model = " + model);
    }
}

// Child Class 1
class Car extends Vehicle {

    int doors;

    Car(String brand, String model, int doors) {
        super(brand, model);
        this.doors = doors;
    }

    void display() {
        super.display();
        System.out.println("Doors = " + doors);
    }
}

// Child Class 2
class Bike extends Vehicle {

    double mileage;

    Bike(String brand, String model, double mileage) {
        super(brand, model);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage = " + mileage + " km/l");
    }
}

// Main Class
public class VehicleInheritance {

    public static void main(String[] args) {
        Car c = new Car("TATA", "Nexon", 4);
        Bike b = new Bike("Honda", "HF-Delux", 70);

    }
}
