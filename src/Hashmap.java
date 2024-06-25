import parking.Car;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> email = new HashMap<>();
        email.put("zabahmut@gmail.com", "Nadia");
        System.out.println(email.get("zabahmut@gmail.com"));
        HashMap<Human, Car> humans = new HashMap<>();
        Car b = new Car("blue", "BX 4736 CI", "Toyota", 6.3, true);
        Human a = new Human("Denis", b, 18.7);
        humans.put(a, b);
    }
}
