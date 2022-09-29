public class Attention{

  public static void main(String[] args){

    System.out.println(testAttention("Hello, my name is Inigo Montoya.", false));
    System.out.println(testAttention("Excuse me, Dr. Kessner?", false));
    System.out.println(testAttention("Hey you! Give me your code!", true));


  }

  public static boolean Attention(String str){
    String hey = str.substring(0, 8);
    return(hey.equals("Hey you!"));
  }

  public static boolean testAttention(String str, boolean expected){
    return(Attention(str) == expected);
  }
}
