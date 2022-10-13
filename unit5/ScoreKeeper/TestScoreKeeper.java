public class TestScoreKeeper{

  public static void main(String[] args){

    ScoreKeeper s1 = new ScoreKeeper();
    s1.scoreNormal();
    s1.scoreNormal();
    s1.scoreBonus();

    ScoreKeeper s2 = new ScoreKeeper();
    for(int i = 0; i < 5; i++){
      s2.scoreNormal();
    }

    ScoreKeeper s3 = new ScoreKeeper();
    for(int i = 0; i < 10; i++){
      s3.scoreBonus();
    }

    testScoreKeeper(s1, 1200);
    testScoreKeeper(s2, 500);
    testScoreKeeper(s3, 10000);

  }

  public static void testScoreKeeper(ScoreKeeper s, int expectedScore){
    System.out.println("score: " + s.getScore());
    System.out.println("expected: " + expectedScore);
    if(s.getScore() == expectedScore){
      System.out.println("passed");
    }
  }
}
