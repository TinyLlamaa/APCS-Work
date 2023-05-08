import processing.core.*;
import java.util.*;

public class Log extends Car{

  private PApplet p;
  private float x;
  private float y;
  private float speed;
  private float width;
  private float height;
  private PImage logImage;
  private float grid;

  public Log(float x, float y, float w, float h, PApplet p, String image, float speed){
    super(x, y, w, h, p, image, speed);

    this.p = p;

    this.x = x;
    this.y = y;

    this.speed = speed;

    grid = 60;

    width = w;
    height = h;

    p.imageMode(p.CORNER);
    logImage = p.loadImage(image);
    logImage.resize((int) w, (int) h);
  }

  public void display(){

    p.image(logImage, x, y);

  }

  public void update(){

    x+=speed;

    if(speed > 0 && x > p.width + grid*2){
      x = -width;
    } else if(x < -width){
      x = p.width + width;
    }

  }

  public float x(){ return x; }

  public float y(){ return y; }

  public float width(){ return width; }

  public float height(){ return height; }

  public float speed(){ return speed; }

  }
