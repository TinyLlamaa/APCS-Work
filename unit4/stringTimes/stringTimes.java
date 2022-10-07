public class stringTimes{

  public static void main(String[] args){
    System.out.println(stringTimesTest("Hi", 2, "HiHi"));
    System.out.println(stringTimesTest("Hi", 4, "HiHiHiHi"));
    System.out.println(stringTimesTest("Hi", 1, "Hi"));
  }

  public static String stringTimes(String str, int n){
    String result = "";

    for(int i = 0; i < n; i++){
      result = result + str;
    }
    return result;
  }

  public static boolean stringTimesTest(String str, int n, String expected){
    return(stringTimes(str, n).equals(expected));
  }
}
