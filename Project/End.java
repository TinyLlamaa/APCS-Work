import processing.core.*;

public class End implements Scene{

  private PApplet p;

  public End(PApplet p){

    this.p = p;

  }

  public void display(){
    p.fill(255);

    p.background(0);
    p.textSize(200);
    p.text("Game Over", p.width/2, p.height/2);
    p.textSize(69);
    p.text("Press Enter to play again", p.width/2, p.height/2+200);

  }

  public void handleKeyPressed(){

  }



}
