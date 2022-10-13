public class frontTimes{

  public static void main(String[] args){
    testFrontTimes("Chocolate", 3, "ChoChoCho");
    testFrontTimes("Chocolate", 2, "ChoCho");
    testFrontTimes("Ab", 3, "AbAbAb");

  }

  public static String frontTimes(String str, int n) {
  int length = 3;
  String result = "";

    if(str.length() < 3){
      length = str.length();
    }

    for(int i = 0; i < n; i++){
      String substr = str.substring(0, length);
      result = result + substr;
    }
  return result;
  }

  public static void testFrontTimes(String str, int n, String expected){
    System.out.println("str: " + str);
    System.out.println("n: " + n);
    System.out.println("result: " + frontTimes(str, n));
    System.out.println("expected: " + expected);
    if(frontTimes(str, n).equals(expected)){
      System.out.println("passed!");
    }
  }
}
