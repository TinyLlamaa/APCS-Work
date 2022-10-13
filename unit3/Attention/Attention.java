public class Attention{

  public static void main(String[] args){

    testAttention("Hello, my name is Inigo Montoya.", false);
    testAttention("Excuse me, Dr. Kessner?", false);
    testAttention("Hey you! Give me your code!", true);


  }

  public static boolean Attention(String str){
    String hey = str.substring(0, 8);
    return(hey.equals("Hey you!"));
  }

  public static void testAttention(String str, boolean expected){
    System.out.println("str: " + str);
    System.out.println("returned: " + Attention(str));
    System.out.println("expected: " + expected);
    if(Attention(str) == expected){
      System.out.println("passed");
    }
  }
}
