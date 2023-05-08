import processing.core.*;
import java.util.*;

//displaywidth = 1440
//displayheight = 900

public class Frogger extends PApplet{

  private ArrayList<Scene> scenes;
  private int current = 0;

  public void settings(){

    size(1380, 900);

  }

  public void setup(){

    scenes = new ArrayList<Scene>();
    scenes.add(new Start(this));
    scenes.add(new Game(this));
    scenes.add(new End(this));
    scenes.add(new Win(this));

  }

  public void draw(){

    //System.out.println(current);

    scenes.get(current).display();


  }

  public void keyPressed(){

    if (keyCode == ENTER){
      if(current == 2){
        current = 0;
      } else {
            current++;
            if (current >= scenes.size()){
              current = 0;
            }
          }
        }

    scenes.get(current).handleKeyPressed();

  }

  public void endScene(){
    current = 2;
  }

  public void winScene(){
    current = 3;
  }

  public static void main(String[] args)
    {
        PApplet.main("Frogger");
    }

}
