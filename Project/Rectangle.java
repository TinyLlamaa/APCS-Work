import processing.core.*;

public class Rectangle{

  private PApplet p;
  private float x;
  private float y;
  private float width;
  private float height;

  public Rectangle(float x, float y, float w, float h, PApplet p){

    this.p = p;
    x = x;
    y = y;
    width = w;
    height = h;

  }



  public float x(){ return x; }

  public float y(){ return y; }

  public float width(){ return width; }

  public float height(){ return height; }


}
