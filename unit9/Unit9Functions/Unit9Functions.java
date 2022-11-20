import java.util.*;

public class Unit9Functions{

  public static void main(String[] args){

    ArrayList<Double> array1 = new ArrayList<Double>();
    array1.add(1.0);
    array1.add(2.1);
    array1.add(5.3);
    ArrayList<Double> array2 = new ArrayList<Double>();
    array2.add(0.0);
    array2.add(-35.0);
    array2.add(90.1);

    System.out.println(findMax(array1));
    System.out.println(findMax(array2));

    ArrayList<Integer> array3 = new ArrayList<Integer>();
    array3.add(51);
    array3.add(52);
    array3.add(53);
    array3.add(100);
    ArrayList<Integer> array4 = new ArrayList<Integer>();
    array4.add(92);
    array4.add(89);
    array4.add(90);
    array4.add(99);

    System.out.println(filterGoodScores(array3));
    System.out.println(filterGoodScores(array4));

    String[] array5 = {"abcd", "xyz"};
    String[] array6 = {"1234", "5678"};
    String[] array7 = {"racecar", "tacocat", "izzi"};

    System.out.println(Arrays.toString(reverseAll(array5)));
    System.out.println(Arrays.toString(reverseAll(array6)));
    System.out.println(Arrays.toString(reverseAll(array7)));

    System.out.println(Arrays.toString(fibonacci(2)));
    System.out.println(Arrays.toString(fibonacci(3)));
    System.out.println(Arrays.toString(fibonacci(4)));
    System.out.println(Arrays.toString(fibonacci(5)));

  }

  public static double findMax(ArrayList<Double> array){

    double result = array.get(0);

    for(int i = 0; i < array.size(); i++){
      if(array.get(i) > result){
        result = array.get(i);
      }
    }

    return result;

  }

  public static ArrayList<Integer> filterGoodScores(ArrayList<Integer> array){

    ArrayList<Integer> result = new ArrayList<Integer>();

    for(int score : array){
      if(score > 90){
        result.add(score);
      }
    }

    return result;

  }

  public static String[] reverseAll(String[] arr){

    String[] resultArr = new String[arr.length];

      for(int i = 0; i < arr.length; i++){
        String result = reverse(arr[i]);
        resultArr[i] = result;
      }

    return resultArr;

  }

  public static String reverse(String start){
    String result = "";

    for(int i = 0; i < start.length(); i++){
      String letter = start.substring(start.length()-1-i, start.length()-i);
      result = result + letter;
    }
    return result;
  }

  public static int[] fibonacci(int num){

    int[] result = new int[num];

    int a = 0;
    int b = 1;

    for(int i = 0; i < num; i++){
      result[i] = b+a;
      b += a;
      a = b-a;
    }

    return result;

  }
}
