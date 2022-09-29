public class GoodDeal{

  public static void main(String[] args){

    goodDealTest(90, 32, true);
    goodDealTest(100, 90, false);

  }

  public static boolean goodDeal(double originalPrice, double salesPrice){
    double n = salesPrice * 100;
    double j = n/originalPrice;

    if(j < 75){
      return true;
    } else{
      return false;
    }
  }

  public static void goodDealTest(double originalPrice, double salesPrice, boolean expected){
    boolean result = goodDeal(originalPrice, salesPrice);

    if(result == expected){
      System.out.println("Correct");
    } else{
      System.out.println("Incorrect");
    }
  }
}
