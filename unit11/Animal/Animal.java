public class Animal{

  private String name;
  private int legCount;
  private boolean furriness;

  public Animal(String name, int legCount, boolean furriness){

    this.name = name;
    this.legCount = legCount;
    this.furriness = furriness;

  }

  public String name(){
    return name;
  }

  public int legCount(){
    return legCount;
  }

  public boolean furriness(){
    return furriness;
  }
}
