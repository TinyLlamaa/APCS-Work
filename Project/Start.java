import processing.core.*;

public class Start implements Scene{

  private PApplet p;
  private PFont font;

  public Start(PApplet p){

    this.p = p;
    font = p.createFont("8-bit Arcade In.ttf", 90);

  }

  public void display(){

    p.fill(255);

    p.background(0);
    p.textFont(font);
    p.textAlign(p.CENTER);
    p.textSize(200);
    p.text("FROGGER", p.width/2, p.height/2);
    p.textSize(69);
    p.text("Press Enter to play", p.width/2, p.height/2+200);


  }

  public void handleKeyPressed(){

  }

}
