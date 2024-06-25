import parking.Car;

public class Human {
    String name ;
    Car car ;
    double age ;
    public Human (String name, Car car, double age) {
        this.name = name;
        this.car = car;
        this.age = age;
    }

    public void changeCar(Car car) {
        this.car = car;
        System.out.println("You have new car");

    }
}
