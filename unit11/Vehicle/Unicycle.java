public class Unicycle implements Vehicle{

  public Unicycle(){

  }

  public String name(){
    return "unicycle";
  }

  public int wheelCount(){
    return 1;
  }

  public boolean isHumanPowered(){
    return true;
  }
}
