package parking;

public class Vehicle {
    String color ;
    String marka ;
    public Vehicle(String color,String marka){
        this.color = color;
        this.marka = marka;

    }
    @Override
    public String toString() {
        return marka;
    }
}
