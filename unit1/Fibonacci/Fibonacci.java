public class Fibonacci{

  public static void main(String[] args){

    int a = 0;
    int b = 1;
    System.out.println(1);

    for(int i = 0; i < 10; i++){
      System.out.println(a + b + " ");
      b += a;
      a = b-a;
    }
  }
}
