public class MagicEightBall{

  private final String reply1;
  private final String reply2;
  private final String reply3;
  private final String reply4;
  private final String reply5;
  private final String reply6;

  private double choice;

  public MagicEightBall(){
    reply1 = "It is certain";
    reply2 = "My sources say no";
    reply3 = "Yes definitely";
    reply4 = "Very doubtful";
    reply5 = "Most likely";
    reply6 = "Cannot predict now";

    choice = Math.floor(Math.random() * 5);
  }

  public String ask(String question){

    if(choice == 1){
      return reply1;
    } else if(choice == 2){
      return reply2;
    } else if(choice == 3){
      return reply3;
    } else if(choice == 4){
      return reply4;
    } else if(choice == 5){
      return reply5;
    } else {
      return reply6;
    }
  }

  public double getChoice(){
    return choice;
  }
}
