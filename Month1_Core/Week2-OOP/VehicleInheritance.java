

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


public class VehicleInheritance {

    public static void main(String[] args) {
        Car c = new Car("TATA", "Nexon", 4);
        Bike b = new Bike("Honda", "HF-Delux", 70);

        System.out.println("--------------CAR---------------");
        c.display();
        System.out.println("--------------BIKE---------------");
        b.display();
        

    }
}
