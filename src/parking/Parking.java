package parking;

import java.util.HashMap;

public class Parking {
    static HashMap<String,Vehicle>list_cars = new HashMap<>();
    public void add_car(Car car){
        if (list_cars.containsKey(car.number)) {
            System.out.println("Machine with number " + car.number + " already exists. Cannot add duplicate machine.");
        }
        else {
            list_cars.put(car.number, car);
        }
    }
    public void delete(String number) {
        list_cars.remove(number);
    }
    public Vehicle surch_car(String number){
        return list_cars.get(number);
    }
    public void parking(Motorcycle parking_motorcykle){
        if (list_cars.containsKey((parking_motorcykle.number))){
            System.out.println("Motorcycle whith number" + parking_motorcykle.number+"already parking");
        }
        else {
            list_cars.put(parking_motorcykle.number,parking_motorcykle);
        }
    }

}

