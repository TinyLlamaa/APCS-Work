public class Greetings{

  public static void main(String[] args){

    testGreetings("Alene", "Hello, Alene, how are you?");
    testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
    testGreetings("Bob", "Hello, Bob, how are you?");
  }

  public static String Greetings(String name){

    return("Hello, " + name + ", how are you?");
  }

  public static void testGreetings(String name, String expected){
    System.out.println("name: " + name);
    System.out.println("return: " + Greetings(name));
    System.out.println("expected: " + expected);
    if(Greetings(name).equals(expected)){
      System.out.println("passed");
    }
  }
}
