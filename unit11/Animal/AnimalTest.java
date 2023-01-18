import java.util.*;

public class AnimalTest{

  public static void main(String[] args){

    ArrayList<Animal> animals = new ArrayList<Animal>();

    animals.add(new Human("Bill", 2, false));
    animals.add(new Cat("Whiskers", 4, true));
    animals.add(new Centipede("Buggy", 100, false));
    animals.add(new Wolf("Alpha", 4, true));

    for(Animal a : animals){
      System.out.println(a.name() + " " + a.legCount() + " " + a.furriness());
    }
  }
}
