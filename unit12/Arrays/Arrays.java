public class Arrays{

  public static void main(String[] args){

    int[][] diagonals = new int[10][10];

    for(int i = 0; i < 10; i++){
      for(int j = 0; j < 10; j++){
        if(i == j){
          diagonals[i][j] = 1;
        } else{
          diagonals[i][j] = 0;
        }
      }
    }

    String[][] strings = { {"Alene", "Sarah", "Madeleine"}, {"Jenny", "Jane"}, {"Zoe"}};

    String[][] strings2 = {{"Alene", "Animal", "Alex"}, {"Jenny", "Addie", "Sarah"}};

    double[][] doubles = new double[5][5];

    for(int i = 0; i < 5; i++){
      for(int j = 0; j < 5; j++){
        doubles[i][j] = ((i+1) * 10) + j + 1;
      }
    }

    int[][] ints = new int[6][5];

    for(int j = 0; j < 6; j++){
      for(int i = 0; i < 5; i++){
        ints[j][i] = j+1;
      }
    }

    float[][] floats = new float[3][3];

    for(int i = 0; i < 3; i++){
      for(int j = 0; j < 3; j++){
        floats[i][j] = ((i+1) * 10) + j + 1;
      }
    }

    float[][] floats2 = { {1f, 2.0f, 3.6f, 2.2f}, {0.1f, 9.8f, 8.34f}, {5.4f}};

    printArrs(diagonals, strings, doubles, ints, floats);

    smallestIntTest(diagonals, 0);
    smallestIntTest(ints, 1);

    addFloatsTest(floats, 198);
    addFloatsTest(floats2, 32.440002f);

    countATest(strings, 1);
    countATest(strings2, 4);

  }

  public static void printArrs(int[][] diagonals, String[][] strings, double[][] doubles, int[][] ints, float[][] floats){
    for(int[] rows: diagonals){
      for(int diagonal : rows){
        System.out.print(diagonal + " ");
      }
      System.out.println();
    }

    for(String[] rows: strings){
      for(String string : rows){
        System.out.print(string + " ");
      }
      System.out.println();
    }

    for(double[] rows: doubles){
      for(double dub : rows){
        System.out.print(dub + " ");
      }
      System.out.println();
    }

    for(int[] rows: ints){
      for(int val : rows){
        System.out.print(val + " ");
      }
      System.out.println();
    }

    for(float[] rows : floats){
      for(float flow : rows){
        System.out.print(flow + " ");
      }
      System.out.println();
    }
  }

  public static int smallestInt(int[][] vals){

    int result = vals[0][0];

    for(int i = 0; i < vals.length; i++){
      for(int j = 0; j < vals[i].length-1; j++){
        if(vals[i][j] < result){
          result = vals[i][j];
        }
      }
    }

      return result;
    }

    public static void smallestIntTest(int[][] vals, int expected){

      System.out.println("result: " + smallestInt(vals));
      System.out.println("expected: " + expected);

      if(smallestInt(vals) == expected){
        System.out.println("passed");
      } else{
        System.out.println("failed");
      }
    }


    public static float addFloats(float[][] vals){

      float result = 0;

      for(int i = 0; i < vals.length; i++){
        for(int j = 0; j < vals[i].length; j++){
          result+=vals[i][j];
        }
      }

      return result;
    }

    public static void addFloatsTest(float[][] vals, float expected){

      System.out.println("result: " + addFloats(vals));
      System.out.println("expected: " + expected);

      if(addFloats(vals) == expected){
        System.out.println("passed");
      } else{
        System.out.println("failed");
      }
    }

    public static int countA(String[][] vals){

      int result = 0;

      for(int i = 0; i < vals.length; i++){
        for(int j = 0; j < vals[i].length; j++){
          if(vals[i][j].substring(0, 1).equals("A")){
            result+=1;
          }
        }
      }

      return result;

    }

    public static void countATest(String[][] vals, int expected){

      System.out.println("result: " + countA(vals));
      System.out.println("expected: " + expected);

      if(countA(vals) == expected){
        System.out.println("passed");
      } else{
        System.out.println("failed");
      }
    }

  }
