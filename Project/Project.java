import processing.core.*;
import java.util.*;

public class Project extends PApplet{

  private ArrayList<Scene> scenes = new ArrayList<Scene>();
  private int current = 0;

  public void settings(){
    size(displayWidth, displayHeight, P3D);
  }

  public void setup(){

    scenes.add(new StartScene(this));
    scenes.add(new GameScene(this));

  }

  public void draw(){

    scenes.get(current).display();

  }

  public void keyPressed(){

    scenes.get(current).ifKeyPressed();

  }

  public void mouseClicked(){

    scenes.get(current).ifMouseClicked();

    if(current == 0){
      current++;
      if(current >= scenes.size()){
          current = 0;
        }
      }
  }

  public void keyReleased(){

    scenes.get(current).ifKeyReleased();

  }

  public static void main(String[] args) {
        PApplet.main("Project");
    }

}
