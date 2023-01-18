import java.util.*;

public class VehicleStats{

  public static void main(String[] args){

    ArrayList<Vehicle> vehicles1 = new ArrayList<Vehicle>();

    Bicycle d = new Bicycle();
    Bicycle r = new Bicycle();
    Motorcycle j = new Motorcycle();
    Unicycle o = new Unicycle();
    Car i = new Car();
    Motorcycle a = new Motorcycle();
    vehicles1.add(d);
    vehicles1.add(r);
    vehicles1.add(j);
    vehicles1.add(o);
    vehicles1.add(i);
    vehicles1.add(a);

    ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    Bicycle b = new Bicycle();
    vehicles.add(b);
    Unicycle u = new Unicycle();
    vehicles.add(u);
    Car c = new Car();
    vehicles.add(c);
    Motorcycle m = new Motorcycle();
    vehicles.add(m);

    ArrayList<Vehicle> expected = new ArrayList<Vehicle>();
    expected.add(b);
    expected.add(u);

    ArrayList<Vehicle> expected1 = new ArrayList<Vehicle>();
    expected1.add(d);
    expected1.add(r);
    expected1.add(o);

    totalWheelCountTest(vehicles, 9);
    isHumanPoweredTest(vehicles, expected);
    totalWheelCountTest(vehicles1, 13);
    isHumanPoweredTest(vehicles1, expected1);

  }

  public static int totalWheelCount(ArrayList<Vehicle> vehicles){
    int result = 0;

    for(Vehicle c: vehicles){
      result+=c.wheelCount();
    }

    return result;
  }

  public static ArrayList<Vehicle> isHumanPowered(ArrayList<Vehicle> vehicles){

    ArrayList<Vehicle> result = new ArrayList<Vehicle>();

    for(int i = 0; i < vehicles.size(); i++){
      Vehicle a = vehicles.get(i);
      if(a.isHumanPowered()){
        result.add(a);
      }
    }

    return result;

  }

  public static void totalWheelCountTest(ArrayList<Vehicle> vehicles, int expected){

    System.out.println("result: " + totalWheelCount(vehicles));
    System.out.println("expected: " + expected);

    if(totalWheelCount(vehicles) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }

  public static void isHumanPoweredTest(ArrayList<Vehicle> vehicles, ArrayList<Vehicle> expected){

    System.out.println("result: " + isHumanPowered(vehicles));
    System.out.println("expected: " + expected);

    if(isHumanPowered(vehicles) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }


}
