import processing.core.*;
import java.util.*;

public class GameScene implements Scene{

  private PApplet p;
  private float baseZ = (p.height/2) / p.tan(p.PI/6);
  private float y = 0;
  private float x = 0;
  private float addX = 0;
  private float addY = 0;


  public GameScene(PApplet p){
    this.p = p;

  }

  public void display(){
    p.background(0);
    p.lights();

    p.camera(p.width/2+addX, p.height/2, baseZ+addY, p.mouseX, p.height/2, 0, 0, 1, 0);

    //circle indicating camera
    p.ellipse(p.mouseX, p.height/2, 10, 10);

    //cute box
    p.pushMatrix();
    p.translate(p.width/2, p.height/2, -100);
    p.noStroke();
    p.box(100);
    p.popMatrix();
  }

  public void ifKeyPressed(){

    if(p.keyCode == 40){
      y = 10;
    } else if(p.keyCode == 38){
      y = -10;
    } else if(p.keyCode == 39){
      x = 10;
    } else if(p.keyCode == 37){
      x = -10;
    } else {
      y = 0;
    }

  }

  public void ifKeyReleased(){

    y = 0;
    x = 0;

  }

  public void ifMouseClicked(){}

  }
