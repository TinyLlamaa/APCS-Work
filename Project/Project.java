import processing.core.*;
import java.util.*;

public class Project extends PApplet{

  public void settings(){
    size(displayWidth, displayHeight, P3D);
  }

  public void setup(){

  }

  public void draw(){
    background(0);
    lights();

    camera(mouseX, height/2, (height/2) / tan(PI/6), width/2, height/2, 0, 0, 1, 0);

    //circle indicating camera
    ellipse(mouseX, height/2, 10, 10);

    //cute box
    pushMatrix();
    translate(width/2, height/2, 0);
    noStroke();
    box(100);
    popMatrix();
  }
}
