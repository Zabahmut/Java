package parking;

public class Car extends Vehicle{
    String number ;
    double volume ;
    boolean is_locked ;
    public Car (String color, String number, String marka , double volume,boolean is_locked){
        super(color,marka);
        this.number = number;
        this.is_locked = is_locked;
        this.volume = volume;
    }
    public void open(){
        if (is_locked == true) {
            is_locked = false;
        }
        else{
            System.out.println("parking.Car already is open");
        }
    }
    public void close(){
        if (is_locked == false){
            is_locked = true;
        }
        else{
            System.out.println("parking.Car is close");
        }

    }


}