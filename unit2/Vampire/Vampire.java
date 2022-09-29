public class Vampire{

  public static void main(String[] args){

    isVampireTest(23.4f, true, true);
    isVampireTest(5, false, false);

  }

  public static boolean isVampire(float hour, boolean awake){
    if((awake == true && (hour > 6 && hour < 22)) || (awake == false && (hour < 6 && hour > 0 || hour < 24 && hour > 22))){
      return false;
    } else{
    return true;
  }
  }

  public static void isVampireTest(float hour, boolean awake, boolean expectation){

    boolean result = isVampire(hour, awake);

    if(result == expectation){
      System.out.println("Correct");
    } else{
      System.out.println("Incorrect");
    }
  }
}
