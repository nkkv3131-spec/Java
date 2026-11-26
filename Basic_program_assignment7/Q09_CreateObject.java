class Car {
    String brand;
    int year;
    Car(String brand, int year) { this.brand = brand; this.year = year; }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
public class Q09_CreateObject {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2024);
        myCar.display();
    }
}
