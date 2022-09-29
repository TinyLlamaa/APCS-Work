public class Makes10{

  public static void main(String[] args){
    makes10test(9, 10, true);
    makes10test(9, 9, false);
    makes10test(1, 9, true);
  }

  public static boolean makes10(int a, int b){
    if(a == 10 || b == 10 || a+b == 10){
      return true;
    }
    return false;
    }

  public static void makes10test(int a, int b, boolean expected){

    boolean result = makes10(a, b);

    if(result == expected){
      System.out.println("Correct");
    } else{
      System.out.println("Incorrect");
    }
  }
}
