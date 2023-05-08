import processing.core.*;

public class Frog extends Rectangle{

  private PApplet p;
  private PImage frogImg;
  private float x;
  private float y;
  private float width;
  private float height;
  private float grid;
  private Log attached;

  public Frog(float x, float y, float w, float h, PApplet p, String frogImage){
    super(x, y, w, h, p);

    this.p = p;
    this.x = x;
    this.y = y;

    grid = 60;

    width = w;
    height = h;


    p.imageMode(p.CORNER);
    frogImg = p.loadImage(frogImage);
    frogImg.resize((int) w, (int) h);

    attached = null;

  }

  public void display(){

    p.image(frogImg, x, y);

  }

  public void move(float xDir, float yDir){

    x += xDir * grid;
    y += yDir * grid;



  }

  public void update(){
    if(attached != null){
      x+=attached.speed();
    }
  }

  public void attach(Log log){
    attached = log;
  }

  public float x(){ return x; }

  public float y(){ return y; }

  public float width(){ return width; }

  public float height(){ return height; }



}
