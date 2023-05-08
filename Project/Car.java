import processing.core.*;

public class Car extends Rectangle{

  private PApplet p;
  private float x;
  private float y;
  private float width;
  private float height;
  private PImage carImg;
  private float speed;
  private float grid;

  public Car(float x, float y, float w, float h, PApplet p, String image, float speed){
    super(x, y, w, h, p);

    this.p = p;
    this.x = x;
    this.y = y;

    grid = 60;

    this.speed = speed;

    width = w;
    height = h;

    p.imageMode(p.CORNER);
    carImg = p.loadImage(image);
    carImg.resize((int) w, (int) h);


  }

  public void display(){

    p.image(carImg, x, y);

  }

  public void update(){

    x += speed;


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

}
