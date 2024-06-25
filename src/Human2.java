import parking.Car;

public class Human2 {
    public static void main(String[] args) {
        Car a = new Car("red","AA 0001 CA","Mazda",2.4,true);
        Human b = new Human("Denis",a,18.7);
        Car c = new Car("red","AA 0001 CA","Pugati",2.4,true);
        b.changeCar(c);

    }
}
