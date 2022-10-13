public class StartHi{

  public static void main(String[] args){

    testStartHi("hi there", true);
    testStartHi("h", false);
    testStartHi("hello hi", false);

  }

  public static boolean startHi(String str) {

  if(str.length() < 2){
    return false;
  }

  String firstTwo = str.substring(0, 2);


  if(firstTwo.equals("hi")){
    return true;
  } else{
    return false;
  }
}


  public static void testStartHi(String str, boolean expected){
    System.out.println("str: " + str);
    System.out.println("returned: " + startHi(str));
    System.out.println("expected: " + expected);
    if(startHi(str) == (expected)){
      System.out.println("passing");
    }
  }
}
