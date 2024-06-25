package parking;

public class Bike extends Vehicle{
    String material ;
    boolean is_parking ;
    public Bike(String color, String marka, String material) {
        super(color, marka);
        this.material = material;
        this.is_parking = is_parking;
    }
    public void parking(){
            if (is_parking == true) {
                is_parking = false;
            }
            else{
                System.out.println("parking.Bike already is parking");
            }
        }
        public void close(){
            if (is_parking == false){
                is_parking = true;
            }
            else{
                System.out.println("parking.Bike is parking");
            }
        }
    }
