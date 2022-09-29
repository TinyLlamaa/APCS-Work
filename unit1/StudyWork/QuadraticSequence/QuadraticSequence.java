public class QuadraticSequence{

  public static void main(String[] args){

    int n = 1;
    int j = 0;

    for(int i = 0; i < 10; i++){
      j+=2;
      n+=j;
      System.out.println(n);
    }
  }
}
