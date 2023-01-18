import java.util.*;

public class AnimalCalculator{

  public static void main(String[] args){

    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Human("Bob", 2, false));
    animals.add(new Cat("Purr", 4, true));
    animals.add(new Centipede("Leggy", 100, false));
    Wolf beta = new Wolf("Beta", 1, true);
    animals.add(beta);
    animals.add(new Wolf("Omega", 3, true));
    animals.add(new Cat("Whisky", 4, true));
    printProperties(animals);
    averageLegCountTest(animals, 19);
    fewestLegsTest(animals, beta);

    ArrayList<Animal> animals1 = new ArrayList<Animal>();
    animals1.add(new Human("Jane", 2, false));
    animals1.add(new Cat("Kaylin", 4, true));
    animals1.add(new Centipede("Cent", 100, false));
    animals1.add(new Wolf("Alphabet", 4, true));
    animals1.add(new Human("Gil", 2, false));
    animals1.add(new Wolf("Beta2", 4, true));
    animals1.add(new Human("Janet", 2, false));
    animals1.add(new Cat("Paws", 4, true));
    animals1.add(new Centipede("Legs", 100, false));
    animals1.add(new Wolf("Omegaverse", 4, true));
    animals1.add(new Cat("ToeBeans", 4, true));
    Human sarah = new Human("Sarah", 1, false);
    animals1.add(sarah);
    printProperties(animals1);
    averageLegCountTest(animals1, 19.25);
    fewestLegsTest(animals1, sarah);
  }

  public static void printProperties(ArrayList<Animal> animals){
    for(Animal a : animals){
      System.out.println("name: " + a.name());
      System.out.println("legCount: " + a.legCount());
      if(a.furriness()){
        System.out.println("furriness: furry");
      } else{
        System.out.println("furriness: not furry");
      }
    }
  }

  public static double averageLegCount(ArrayList<Animal> animals){

    double total = 0;

    for(Animal b: animals){
      total += b.legCount();
    }

    return total / animals.size();
  }

  public static Animal fewestLegs(ArrayList<Animal> animals){

    Animal result = new Animal("", 0, false);

    Animal c = animals.get(0);
    int lowestLegCount = c.legCount();

    for(Animal d : animals){
      if(d.legCount() < lowestLegCount){
        lowestLegCount = d.legCount();
        result = d;
      }
    }

    return result;
  }

  public static void averageLegCountTest(ArrayList<Animal> animals, double expected){
    System.out.println("result: " + averageLegCount(animals));
    System.out.println("expected: " + expected);

    if(averageLegCount(animals) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }

  public static void fewestLegsTest(ArrayList<Animal> animals, Animal expected){
    System.out.println("result: " + fewestLegs(animals));
    System.out.println("expected: " + expected);

    if(fewestLegs(animals) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }
}
