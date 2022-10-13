public class Close10{

  public static void main(String[] args){

    testClose10(8, 13, 8);
    testClose10(13, 7, 0);
    testClose10(13, 9, 9);

  }

  public static int Close10(int a, int b){
    if(Math.abs(10-a) < Math.abs(10-b)){
    return a;
  } else if(Math.abs(10-b) < Math.abs(10-a)){
    return b;
  } else{
    return 0;
  }

  }

  public static void testClose10(int a, int b, int expected){

    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("returned: " + Close10(a, b));
    System.out.println("expected: " + expected);

    if(Close10(a, b) == expected){
      System.out.println("passed");
    }

  }
}
