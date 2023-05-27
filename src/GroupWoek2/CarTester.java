package GroupWoek2;

public class CarTester {
    public static void main(String[] args) {
        Car car = new Car(50000.0, "Red");
        System.out.println("Car Price: " + car.calculateSalePrice());

        Saden saden = new  Saden(60000.0, "Blue", 2500);
        System.out.println("Truck Price: " + saden.calculateSalePrice());

        Truck truck = new Truck(40000.0, "Black", 25);
        System.out.println("Sedan Price: " + truck.calculateSalePrice());
    }
}
