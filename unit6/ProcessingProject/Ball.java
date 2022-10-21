
import processing.core.*;

public class Ball{

  private PVector position;
  private PVector velocity;
  private PApplet p;

  public Ball(PApplet p, PVector position, PVector velocity){

    this.position = position;
    this.velocity = velocity;
    this.p = p;

  }

  public void display(){
    p.fill(25, 89, 76);
    p.ellipse(position.x, position.y, 50, 50);
  }

  public void move(){
    position.add(velocity);

    if(position.x < 25 || position.x > 775){
      velocity.x*=-1;
    }

    if(position.y < 25 || position.y > 775){
      velocity.y*=-1;
    }
  }

  public PVector getPosition(){
    return position;
  }
}
