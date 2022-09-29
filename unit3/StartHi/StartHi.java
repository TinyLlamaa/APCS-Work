public class StartHi{

  public static void main(String[] args){

    System.out.println(testStartHi("hi there", true));
    System.out.println(testStartHi("h", false));
    System.out.println(testStartHi("hello hi", false));

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


  public static boolean testStartHi(String str, boolean expected){
    return(startHi(str) == expected);
  }
}
