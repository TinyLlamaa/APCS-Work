public class stringTimes{

  public static void main(String[] args){
    stringTimesTest("Hi", 2, "HiHi");
    stringTimesTest("Hi", 4, "HiHiHiHi");
    stringTimesTest("Hi", 1, "Hi");
  }

  public static String stringTimes(String str, int n){
    String result = "";

    for(int i = 0; i < n; i++){
      result = result + str;
    }
    return result;
  }

  public static void stringTimesTest(String str, int n, String expected){
    System.out.println("str: " + str);
    System.out.println("n: " + n);
    System.out.println("result: " + stringTimes(str, n));
    System.out.println("expected: " + expected);
    if(stringTimes(str, n).equals(expected)){
      System.out.println("passed!");
    }
  }
}
