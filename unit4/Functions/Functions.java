public class Functions{

  public static void main(String[] args){

    testSumOfSquares(1, 1);
    testSumOfSquares(2, 5);
    testSumOfSquares(3, 14);

    testCountOccurences("Mississippi", "iss", 2);
    testCountOccurences("banananana", "na", 4);

    testReverse("bad", "dab");
    testReverse("Hello, world!", "!dlrow ,olleH");
    testReverse("tacocat", "tacocat");

    testFactorials(1, 1);
    testFactorials(2, 2);
    testFactorials(3, 6);
    testFactorials(4, 24);
    testFactorials(5, 120);

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

  public static void testSumOfSquares(int n, int expected){
    System.out.println("testSumOfSquares");
    System.out.println("n: " + n);
    System.out.println("returned: " + sumOfSquares(n));
    System.out.println("expected: " + expected);
    if(sumOfSquares(n) == expected){
      System.out.println("passed");
    }
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

  public static void testCountOccurences(String a, String sub, int expected){
    System.out.println("testCountOccurences");
    System.out.println("a: " + a);
    System.out.println("sub: " + sub);
    System.out.println("returned: " + countOccurrences(a, sub));
    System.out.println("expected: " + expected);
    if(countOccurrences(a, sub) == expected){
      System.out.println("passed");
    }
  }

  public static String reverse(String start){
    String result = "";

    for(int i = 0; i < start.length(); i++){
      String letter = start.substring(start.length()-1-i, start.length()-i);
      result = result + letter;
    }
    return result;
  }

  public static void testReverse(String start, String expected){
    System.out.println("testReverse");
    System.out.println("start: " + start);
    System.out.println("returned: " + reverse(start));
    System.out.println("expected: " + expected);
    if(reverse(start).equals(expected)){
      System.out.println("passed");
    }
  }

  public static int factorials(int n){

    int factorial = 1;

    for(int i = 1; i < n+1; i++){
      factorial = i * factorial;
    }

    return factorial;
  }

  public static void testFactorials(int n, int expected){
    System.out.println("testFactorials");
    System.out.println("n: " + n);
    System.out.println("returned: " + factorials(n));
    System.out.println("expected: " + expected);
    if(factorials(n) == expected){
      System.out.println("passed");
    }
  }



}
