public class TestPerson{

  public static void main(String[] args){

    Person p1 = new Person("Alene", 2);
    testPerson(p1, "Alene", 2, "Hello my name is Alene and I have 2 pets.");

    Person p2 = new Person("Dr. Kessner", 82);
    testPerson(p2, "Dr. Kessner", 82, "Hello my name is Dr. Kessner and I have 82 pets.");

    Person p3 = new Person("Madeleine", 500);
    testPerson(p3, "Madeleine", 500, "Hello my name is Madeleine and I have 500 pets.");
  }

  public static void testPerson(Person p, String expectedName, int expectedPets, String expectedGreeting){
    boolean resultName = p.getName().equals(expectedName);
    boolean resultPets = p.getPets() == expectedPets;
    boolean greeting = p.greeting().equals(expectedGreeting);
    System.out.println(resultName);
    System.out.println(resultPets);
    System.out.println(greeting);
  }
}
