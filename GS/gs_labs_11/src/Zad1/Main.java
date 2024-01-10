package Zad1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(30);
        System.out.println(drive(car1, 500));

        Car car2 = new Car(5);
        System.out.println(drive(car2, 400));
    }

    public static boolean drive(Car car, int distance) // distance in km
    {
        // 5l/100km
        return car.fuelLevel > distance / 20;
    }
}
