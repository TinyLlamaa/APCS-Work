public class Functions{

  public static void main(String[] args){

    System.out.println(testSumOfSquares(1, 1));
    System.out.println(testSumOfSquares(2, 5));
    System.out.println(testSumOfSquares(3, 14));

    System.out.println(testCountOccurences("Mississippi", "iss", 2));
    System.out.println(testCountOccurences("banananana", "na", 4));

    System.out.println(testReverse("bad", "dab"));
    System.out.println(testReverse("Hello, world!", "!dlrow ,olleH"));
    System.out.println(testReverse("tacocat", "tacocat"));

    System.out.println(testFactorials(1, 1));
    System.out.println(testFactorials(2, 2));
    System.out.println(testFactorials(3, 6));
    System.out.println(testFactorials(4, 24));
    System.out.println(testFactorials(5, 120));

  }

  public static int sumOfSquares(int n){
    int  q = 0;
    int result = 0;
    for(int i = 0; i < n+1; i++){
      q = i * i;
      result = result + q;
    }
    return(result);
  }

  public static boolean testSumOfSquares(int n, int expected){
    return(sumOfSquares(n) == expected);
  }

  public static int countOccurrences(String a, String sub){
    int count = 0;
    int woah = 0;

    for(int i = 0; i < a.length()-sub.length()+1; i++){
      String substring = a.substring(i, i+sub.length());
      if(sub.equals(substring)){
        count++;
      }
    }
    return count;
  }

  public static boolean testCountOccurences(String a, String sub, int expected){
    return(countOccurrences(a, sub) == expected);
  }

  public static String reverse(String start){
    String result = "";

    for(int i = 0; i < start.length(); i++){
      String letter = start.substring(start.length()-1-i, start.length()-i);
      result = result + letter;
    }
    return result;
  }

  public static boolean testReverse(String start, String expected){
    return(reverse(start).equals(expected));
  }

  public static int factorials(int n){

    int factorial = 1;

    for(int i = 1; i < n+1; i++){
      factorial = i * factorial;
    }

    return factorial;
  }

  public static boolean testFactorials(int n, int expected){
    return(factorials(n) == expected);
  }



}
