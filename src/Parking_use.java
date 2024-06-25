import parking.Car;
import parking.Motorcycle;
import parking.Parking;

public class Parking_use {
    public static void main(String[] args) {
        Parking city_parking= new Parking ();
        city_parking.add_car(new Car("blue", "AA0001AA", "Nisan",2.2,true));
        city_parking.add_car(new Car("blue", "AA0002AA", "Nisan",2.2,true));
        city_parking.delete("Вс5555Вс");
        city_parking.surch_car("Вс5555Вс");
        city_parking.parking(new Motorcycle("red","Viper", 1.1 ,"AA6234CA"));

        System.out.println(city_parking.surch_car("Вс5555Вс"));
    }

    }
