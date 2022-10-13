public class Person{

  private int pets;
  private String name;

  public Person(String nameIn, int numPets){

      pets = numPets;
      name = nameIn;

  }

  public int getPets(){
    return pets;
  }

  public String getName(){
    return name;
  }

  public String greeting(){
    return ("Hello my name is " + name + " and I have " + pets + " pets.");
  }

}
