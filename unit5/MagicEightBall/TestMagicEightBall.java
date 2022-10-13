public class TestMagicEightBall{

  public static void main(String[] args){

    MagicEightBall m1 = new MagicEightBall();
    testMagicEightBall(m1, "Will I get an A+ in APCS?");

    MagicEightBall m2 = new MagicEightBall();
    testMagicEightBall(m2, "Will this code work?");

    MagicEightBall m3 = new MagicEightBall();
    testMagicEightBall(m3, "Will I get a 5 on my APCS AP test?");
  }

  public static void testMagicEightBall(MagicEightBall m, String question){
    System.out.println("question: " + question);
    System.out.println("random reply: " + m.ask(question));
    System.out.println("random reply number: " + m.getChoice());
  }
}
