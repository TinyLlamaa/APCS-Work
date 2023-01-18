import java.util.*;

public class PersonStats{

  public static double averageNumPet(ArrayList<Person> persons){

    double total = 0;

    for(int i = 0; i < persons.size(); i++){
      Person a = persons.get(i);
      total += a.getNumPet();
    }

    return total / persons.size();

  }

  public static void averageNumPetTest(ArrayList<Person> persons, double expected){
    System.out.println("test: " + averageNumPet(persons));
    System.out.println("expected: " + expected);

    if(averageNumPet(persons) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }

  public static String mostPetsName(ArrayList<Person> persons){

    int numPet = 0;
    String name = "";

    for(int i = 0; i < persons.size(); i++){

      Person a = persons.get(i);

      if(a.getNumPet() > numPet){
        numPet = a.getNumPet();
        name = a.getName();
      }
    }

    return name;

  }

  public static void mostPetsNameTest(ArrayList<Person> persons, String expected){
    System.out.println("test: " + mostPetsName(persons));
    System.out.println("expected: " + expected);

    if(mostPetsName(persons).equals(expected)){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }

  public static ArrayList<Person> moreThanTwoPets(ArrayList<Person> persons){

    ArrayList<Person> moreThanTwo = new ArrayList<Person>();

    for(int i = 0; i < persons.size(); i++){
      Person a = persons.get(i);
      if(a.getNumPet() >= 2){
        moreThanTwo.add(a);
      }
    }

    return moreThanTwo;

  }

  public static void moreThanTwoPetsTest(ArrayList<Person> persons, ArrayList<Person> expected){
    System.out.println("test: " + moreThanTwoPets(persons));
    System.out.println("expected: " + expected);

    if(moreThanTwoPets(persons) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }

  public static void main(String[] args){

    ArrayList<Person> persons = new ArrayList<Person>();
    Person Bill = new Person("Bill", 2);
    Person Jeff = new Person("Jeff", 4);
    Person Sarah = new Person("Sarah", 3);
    Person Tim = new Person("Tim", 0);
    Person John = new Person("John", 2);
    persons.add(Bill);
    persons.add(Jeff);
    persons.add(Sarah);
    persons.add(Tim);
    persons.add(John);

    ArrayList<Person> expected = new ArrayList<Person>();
    expected.add(Bill);
    expected.add(Jeff);
    expected.add(Sarah);
    expected.add(John);

    averageNumPetTest(persons, 2.2);
    mostPetsNameTest(persons, "Jeff");
    moreThanTwoPetsTest(persons, expected);

    ArrayList<Person> persons1 = new ArrayList<Person>();
    Person Jill = new Person("Jill", 20);
    Person Christi = new Person("Christi", 10);
    Person Kendall = new Person("Kendall", 8);
    Person Melissa = new Person("Melissa", 1);
    Person Holly = new Person("Holly", 3);
    persons1.add(Jill);
    persons1.add(Christi);
    persons1.add(Kendall);
    persons1.add(Melissa);
    persons1.add(Holly);

    ArrayList<Person> expected1 = new ArrayList<Person>();
    expected1.add(Christi);
    expected1.add(Holly);
    expected1.add(Jill);
    expected1.add(Kendall);

    averageNumPetTest(persons1, 8.4);
    mostPetsNameTest(persons1, "Jill");
    moreThanTwoPetsTest(persons1, expected1);

  }
}
