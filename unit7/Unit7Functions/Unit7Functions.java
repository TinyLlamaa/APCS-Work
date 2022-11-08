public class Unit7Functions{

  public static void main(String[] args){
    int[] arr = {1, 2, 3};
    int[] arr1 = {7, 13, 17};
    int[] arr2 = {107, 207};
    double[] arr3 = {0};
    double[] arr4 = {1.0, 2.0, 3.0};
    double[] arr5 = {2.0, 2.0, 2.0};
    String[] arr6 = {"Dr. Kessner", "Dr. Sands"};
    String[] arr7 = {"Zorro", "zero", "zippy"};
    countLuckyTest(arr, 0);
    countLuckyTest(arr1, 2);
    countLuckyTest(arr2, 2);
    sumOfSquaresTest(arr3, 0);
    sumOfSquaresTest(arr4, 14.0);
    sumOfSquaresTest(arr5, 12.0);
    totalZNameLengthTest(arr6, 0);
    totalZNameLengthTest(arr7, 0);

  }

  public static int countLucky(int[] arr){
    int result = 0;

    for(int i = 0; i < arr.length; i++){
      if(arr[i] % 10 == 7 || arr[i] % 7 == 0){
        result++;
      }
    }

    return result;
  }

  public static void countLuckyTest(int[] arr, int expected){
    System.out.println("array: " + arr);
    System.out.println("expected: " + expected);
    System.out.println("result: " + countLucky(arr));

    if(expected == countLucky(arr)){
      System.out.println("passed!");
    }
  }

  public static double sumOfSquares(double[] arr){
    int result = 0;

    for(int i = 0; i < arr.length; i++){
      result+=arr[i]*arr[i];
    }

    return result;
  }

  public static void sumOfSquaresTest(double[] arr, double expected){
    System.out.println("array: " + arr);
    System.out.println("expected: " + expected);
    System.out.println("result: " + sumOfSquares(arr));

    if(expected == sumOfSquares(arr)){
      System.out.println("passed!");
    }
  }

  public static int totalZNameLength(String[] arr){
    int result = 0;

    for(int i = 0; i < arr.length; i ++){
      String sub = arr[i].substring(0, 1);
      if(sub.equals('z') || sub.equals('Z')){
        result += arr[i].length();
      }
    }
    return result;
  }

  public static void totalZNameLengthTest(String[] arr, int expected){
    System.out.println("array: " + arr);
    System.out.println("expected: " + expected);
    System.out.println("result: " + totalZNameLength(arr));

    if(expected == totalZNameLength(arr)){
      System.out.println("passed!");
    }
  }

}
