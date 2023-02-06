public class RectangleArrays{

  public static void main(String[] args){

    Rectangle a = new Rectangle("Patricia", 20.6, 8.2);
    Rectangle b = new Rectangle("Patrick", 18.2, 2.2);
    Rectangle c = new Rectangle("Bill", 2, 22);
    Rectangle d = new Rectangle("Gladys", 5.6, 8);
    Rectangle e = new Rectangle("Sarah", 4, 4);
    Rectangle f = new Rectangle("Chloe", 32, 3.4);
    Rectangle g = new Rectangle("Karen", 15.2, 26);

    Rectangle[][] arr1 = { {a, b, c} , {d, e} , {f, g} };

    Rectangle h = new Rectangle("Jerry", 2, 4.1);
    Rectangle i = new Rectangle("Janis", 20.6, 8.2);
    Rectangle j = new Rectangle("Ian", 9.1, 3);
    Rectangle k = new Rectangle("Daniel", 10.4, 13.1);

    Rectangle[][] arr2 = { {h, i}, {j, k} };

    avgPerimeterTest(arr1, 48.97142857142857);
    avgPerimeterTest(arr2, 35.25);

    greatestAreaTest(arr1, g);
    greatestAreaTest(arr2, i);
  }

  public static double avgPerimeter(Rectangle[][] arr){

    double perimeter = 0;
    int vals = 0;

    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        perimeter += arr[i][j].perimeter();
        vals+=1;
      }
    }

    return perimeter / vals;

  }

  public static void avgPerimeterTest(Rectangle[][] arr, double expected){
    System.out.println("result: " + avgPerimeter(arr));
    System.out.println("expected: " + expected);

    if(avgPerimeter(arr) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }

  public static Rectangle greatestArea(Rectangle[][] arr){

    Rectangle result = new Rectangle("null", 0, 0);
    double area = 0;

    for(int i = 0; i < arr.length; i++){
      for(int j = 0; j < arr[i].length; j++){
        if(arr[i][j].area() > area){
          area = arr[i][j].area();
          result = arr[i][j];
        }
      }
    }

    return result;

  }

  public static void greatestAreaTest(Rectangle[][] arr, Rectangle expected){
    System.out.println("result: " + greatestArea(arr));
    System.out.println("expected: " + expected);

    if(greatestArea(arr) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
    }
  }


}
