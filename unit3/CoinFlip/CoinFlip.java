public class CoinFlip{

  public static void main(String[] args){

    for(int i = 0; i < 10; i++){
      System.out.println(CoinFlip());
    }

  }

  public static String CoinFlip(){
      double n = Math.random();
      if(n < .5){
        return "Heads";
      } else{
        return "Tails";
      }
  }

}
