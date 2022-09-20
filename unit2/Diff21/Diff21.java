public class Diff21{

  public static void main(String[] args){
    System.out.println(diff21test(48, 12, 0, 87));
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

  public static diff21test(int n, int k, int a, int b){
    diff21(n);
    diff21(k);
    diff21(a);
    diff21(b);
  }
}
