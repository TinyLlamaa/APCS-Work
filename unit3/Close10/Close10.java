public class Close10{

  public static void main(String[] args){

    System.out.println(testClose10(8, 13, 8));
    System.out.println(testClose10(13, 7, 0));
    System.out.println(testClose10(13, 9, 9));

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

  public static boolean testClose10(int a, int b, int expected){

    return(Close10(a, b) == expected);

  }
}
