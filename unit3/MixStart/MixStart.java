public class MixStart{

  public static void main(String[] args){

    testMixStart("mix snacks", true);
    testMixStart("mi", false);
    testMixStart("piz snacks", false);

  }

  public static boolean mixStart(String str) {

  if(str.length() < 3){
    return false;
  }

  String ix = str.substring(1, 3);

  return(ix.equals("ix"));
}


  public static void testMixStart(String str, boolean expected){

    System.out.println("str: " + str);
    System.out.println("returned: " + mixStart(str));
    System.out.println("expected: " + expected);
    if(mixStart(str) == expected){
      System.out.println("passed");
    }

  }
}
