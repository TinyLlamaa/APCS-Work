import java.util.*;

public class Unit8Functions{

  public static void main(String[] args){

    ArrayList<Integer> array = new ArrayList<Integer>();
    array.add(1);
    array.add(2);
    array.add(3);
    ArrayList<Integer> array1 = new ArrayList<Integer>();
    array1.add(7);
    array1.add(13);
    array1.add(17);
    ArrayList<Integer> array2 = new ArrayList<Integer>();
    array2.add(107);
    array2.add(207);
    ArrayList<Double> array3 = new ArrayList<Double>();
    array3.add(0.0);
    ArrayList<Double> array4 = new ArrayList<Double>();
    array4.add(1.0);
    array4.add(2.0);
    array4.add(3.0);
    ArrayList<Double> array5 = new ArrayList<Double>();
    array5.add(2.0);
    array5.add(2.0);
    array5.add(2.0);
    ArrayList<String> array6 = new ArrayList<String>();
    array6.add("Dr. Kessner");
    array6.add("Dr. Sands");
    ArrayList<String> array7 = new ArrayList<String>();
    array7.add("Zorro");
    array7.add("zero");
    array7.add("zippy");

    countLuckyTest(array, 0);
    countLuckyTest(array1, 2);
    countLuckyTest(array2, 2);
    sumOfSquaresTest(array3, 0);
    sumOfSquaresTest(array4, 14.0);
    sumOfSquaresTest(array5, 12.0);
    totalZNameLengthTest(array6, 0);
    totalZNameLengthTest(array7, 0);

  }

  public static int countLucky(ArrayList<Integer> array){
    int result = 0;

    for(int i = 0; i < array.size(); i++){
      if(array.get(i) % 10 == 7 || array.get(i) % 7 == 0){
        result++;
      }
    }

    return result;
  }

  public static void countLuckyTest(ArrayList<Integer> array, int expected){
    System.out.println("ArrayList: " + array);
    System.out.println("expected: " + expected);
    System.out.println("result: " + countLucky(array));

    if(expected == countLucky(array)){
      System.out.println("passed!");
    }
  }

  public static double sumOfSquares(ArrayList<Double> array){
    double result = 0;

    for(double value : array){
      result+=value*value;
    }

    return result;
  }

  public static void sumOfSquaresTest(ArrayList<Double> array, double expected){
    System.out.println("ArrayList: " + array);
    System.out.println("expected: " + expected);
    System.out.println("result: " + sumOfSquares(array));

    if(expected == sumOfSquares(array)){
      System.out.println("passed!");
    }
  }

  public static int totalZNameLength(ArrayList<String> array){
    int result = 0;

    for(int i = 0; i < array.size(); i ++){
      String value = array.get(i);
      String sub = value.substring(0, 1);
      if(sub.equals('z') || sub.equals('Z')){
        result += value.length();
      }
    }

    return result;

  }

  public static void totalZNameLengthTest(ArrayList<String> array, int expected){
    System.out.println("ArrayList: " + array);
    System.out.println("expected: " + expected);
    System.out.println("result: " + totalZNameLength(array));

    if(expected == totalZNameLength(array)){
      System.out.println("passed!");
    }
  }
}
