public class Greetings{

  public static void main(String[] args){

    System.out.println(testGreetings("Alene", "Hello, Alene, how are you?"));
    System.out.println(testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?"));
    System.out.println(testGreetings("Bob", "Hello, Bob, how are you?"));
  }

  public static String Greetings(String name){

    return("Hello, " + name + ", how are you?");
  }

  public static boolean testGreetings(String name, String expected){
    return(Greetings(name).equals(expected));
  }
}
