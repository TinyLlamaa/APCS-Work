import processing.core.*;
import java.util.*;

public class StartScene implements Scene{

  private PApplet p;
  private PImage bckgrnd;
  private PFont font1;

  public StartScene(PApplet p){
    this.p = p;
    bckgrnd = p.loadImage("Cyberpunk.jpg");
    bckgrnd.resize(p.displayWidth, p.displayHeight);
    font1 = p.createFont("Cyberpunks.ttf", 200);
  }

  public void display(){
    p.background(bckgrnd);
    p.textAlign(PApplet.CENTER);
    p.textSize(69);
    p.textFont(font1);
    p.text("Cool Game", p.width/2, p.height/2);
  }

  public void ifKeyPressed(){}

  public void ifKeyReleased(){}

  public void ifMouseClicked(){}


}
