
import processing.core.*;
import java.util.*;

public class ProcessingProject extends PApplet{

  private ArrayList<Ball> balls;

  public void settings(){

    size(800, 800);
  }


  public void setup(){

    balls = new ArrayList<Ball>();

  }

  public void draw(){

    background(0);

    for(Ball c : balls){
    c.display();
    c.move();
  }

  }


  public void mouseClicked(){

    PVector positionMouse = new PVector(mouseX, mouseY);

    createClickedBall(positionMouse);

}

  public void createClickedBall(PVector position){

    PVector velocity = PVector.random2D();
    velocity.setMag(random(3, 5));

    Ball c;
    c = new Ball(this, position, velocity);
    balls.add(c);
  }

  public static void main(String[] args){
    PApplet.main("ProcessingProject");

  }

}
