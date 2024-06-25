package parking;

public class Motorcycle extends Vehicle {
    String number ;
    double volume ;
    public Motorcycle(String color ,String marka,double volume,String number){
        super(color,marka);
        this.number = number;
        this.volume = volume;
    }
}
