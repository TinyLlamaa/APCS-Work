public class Diff21{

  public static void main(String[] args){
    diff21test(21, 0);
    diff21test(10, 11);
    diff21test(19, 2);
  }

  public static int diff21(int n){

    int j;

    j = n - 21;

    if(j < 0){
      j*=-1;
    }

    if(n > 21){
      j*=2;
      return j;
    } else{
      return j;
    }
  }

  public static void diff21test(int n, int expected){
    int result = diff21(n);

    if(result == expected){
      System.out.println("Correct");
    } else{
      System.out.println("Incorrect");
    }
  }
}
