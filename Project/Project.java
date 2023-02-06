import processing.core.*;
import java.util.*;

public class Project extends PApplet{

  public float x = (height/2) / tan(PI/6);
  public float y = 0;

  public void settings(){
    size(displayWidth, displayHeight, P3D);
  }

  public void setup(){

  }

  public void draw(){
    background(0);
    lights();

    camera(mouseX, height/2, x, width/2, height/2, 0, 0, 1, 0);

    //circle indicating camera
    ellipse(mouseX, height/2, 10, 10);

    //cute box
    pushMatrix();
    translate(width/2, height/2, 0);
    noStroke();
    box(100);
    popMatrix();
  }

  public void keyPressed(){

    if(keyCode == 40){
      y = 10;
    } else if(keyCode == 38){
      y = -10;
    } else {
      y = 0;
    }

  }

  public void keyReleased(){
    y = 0;
  }

  public static void main(String[] args) {
        PApplet.main("Project");
    }

}
