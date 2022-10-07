public class frontTimes{

  public static void main(String[] args){
    System.out.println(testFrontTimes("Chocolate", 3, "ChoChoCho"));
    System.out.println(testFrontTimes("Chocolate", 2, "ChoCho"));
    System.out.println(testFrontTimes("Ab", 3, "AbAbAb"));

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

  public static boolean testFrontTimes(String str, int n, String expected){
    return(frontTimes(str, n).equals(expected));
  }
}
