import java.util.*;

public class VehicleTest{

  public static void main(String[] args){
    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Bicycle b = new Bicycle();
    vehicles.add(b);
    Unicycle u = new Unicycle();
    vehicles.add(u);
    Car c = new Car();
    vehicles.add(c);
    Motorcycle m = new Motorcycle();
    vehicles.add(m);

    for(Vehicle a : vehicles){
      System.out.println(a.name() + " " + a.wheelCount() + " " + a.isHumanPowered());
    }


  }

}
