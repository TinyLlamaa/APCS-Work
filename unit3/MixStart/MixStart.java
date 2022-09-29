public class MixStart{

  public static void main(String[] args){

    System.out.println(testMixStart("mix snacks", true));
    System.out.println(testMixStart("mi", false));
    System.out.println(testMixStart("piz snacks", false));

  }

  public static boolean mixStart(String str) {

  if(str.length() < 3){
    return false;
  }

  String ix = str.substring(1, 3);

  return(ix.equals("ix"));
}


  public static boolean testMixStart(String str, boolean expected){
    return(mixStart(str) == expected);
  }
}
