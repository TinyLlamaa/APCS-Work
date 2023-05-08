import processing.core.*;
import java.util.*;

public class Game implements Scene{

  private Frog frog;
  private Car car;
  private float grid;
  private ArrayList<Car> cars;
  private ArrayList<Log> logs;
  private String carImg;
  private String logImg;
  private PImage groundBlock;
  private String frogImage;
  private Frogger p;
  private Log noll;
  private boolean onLog;


  public Game(Frogger p){

    grid = 60;

    groundBlock = p.loadImage("groundBlock.png");
    groundBlock.resize((int) grid, (int) grid);


    cars = new ArrayList<Car>();
    logs = new ArrayList<Log>();

    //row 2 cars
    for(int i = 0; i < 5; i++){
      carImg = "car1.png";
      cars.add(new Car(0 + i * 300, p.height-grid*3, grid*2, grid, p, carImg, 2));
    }

    //row 3 cars
    for(int i = 0; i < 4; i++){
      carImg = "car2.png";
      cars.add(new Car(-200 + i * 400, p.height-grid*4, grid*2, grid, p, carImg, -2));
    }

    //row 4 cars
    for(int i = 0; i < 6; i++){
      carImg = "car3.png";
      cars.add(new Car(-100 + i * 250, p.height-grid*5, grid*2, grid, p, carImg, 2));
    }

    //row 6 logs
    for(int i = 0; i < 5; i++){
      logImg = "log1.png";
      logs.add(new Log(0 + i * 300, p.height-grid*7, grid*2, grid, p, logImg, 2));
    }

    //row 7 logs
    for(int i = 0; i < 4; i++){
      logImg = "log2.png";
      logs.add(new Log(-200 + i * 400, p.height-grid*8, grid*2, grid, p, logImg, -3));
    }

    //row 8 logs
    for(int i = 0; i < 6; i++){
      logImg = "log1.png";
      logs.add(new Log(-100 + i * 250, p.height-grid*9, grid*2, grid, p, logImg, 2));
    }

    //row 9 logs
    for(int i = 0; i < 3; i++){
      logImg = "log1.png";
      logs.add(new Log(-100 + i * 500, p.height-grid*10, grid*3, grid, p, logImg, -3));
    }

    //row 11 cars
    for(int i = 0; i < 5; i++){
      carImg = "car1.png";
      cars.add(new Car(0 + i * 300, p.height-grid*12, grid*2, grid, p, carImg, 2));
    }

    //row 12 cars
    for(int i = 0; i < 4; i++){
      carImg = "car2.png";
      cars.add(new Car(-200 + i * 400, p.height-grid*13, grid*2, grid, p, carImg, -2));
    }

    //row 13 cars
    for(int i = 0; i < 6; i++){
      carImg = "car3.png";
      cars.add(new Car(-100 + i * 250, p.height-grid*14, grid*2, grid, p, carImg, 2));
    }



    this.p = p;
    frogImage = "frog.png";
    frog = new Frog(685, 780, 70, 60, p, frogImage);

    noll = null;

  }

  public void display(){

    p.background(0);

    for(int j = 0; j < 2; j++){
      for(int i = 0; i < 40; i++){
        p.image(groundBlock, i*60, p.height-grid*2-j*4*grid);
      }
    }

    for(int i = 0; i < 40; i++){
      p.image(groundBlock, i * 60, p.height-grid*11);
    }

    for(int i = 0; i < 40; i++){
      p.image(groundBlock, i * 60, p.height-grid*15);
    }

    for(Car car: cars){
      car.display();
      car.update();

      if(carCollision(car)){
        resetGame();
        endGame();
      }

    }

    onLog = false;
    frog.attach(noll);

    for(Log log : logs){

      log.display();
      log.update();

      if(logCollision(log)){
        onLog = true;
        frog.attach(log);
      }

  }

  if(frog.y() == p.height-grid*8){
    onLog = true;
  }

  if(!onLog && frog.y() >= p.height-grid*9 && frog.y() <= p.height-grid*7){
    resetGame();
    endGame();
  }

  if(frog.x() > p.width || frog.x() < 0 || frog.y() < 0){
    resetGame();
    endGame();
  }

  if(frog.y() == p.height-grid*15){
    resetGame();
    winGame();
  }


    frog.display();
    frog.update();

    p.fill(255);
}


  public void resetGame(){
    frog = new Frog(685, 780, 70, 60, p, frogImage);
  }

  public void handleKeyPressed(){

    if(p.keyCode == p.UP){
      frog.move(0, -1);
      frogImage = "frog.png";
    } else if(p.keyCode == p.DOWN){
      frog.move(0, 1);
      frogImage = "frog.png";
    } else if(p.keyCode == p.LEFT){
      frog.move(-1, 0);
      frogImage = "frog.png";
    } else if(p.keyCode == p.RIGHT){
      frog.move(1, 0);
      frogImage = "frog.png";
    }

  }

  public boolean carCollision(Car car){

    float left = frog.x();
    float right = frog.x()+frog.width();
    float top = frog.y();
    float bottom = frog.y()+frog.height();

    float oleft = car.x();
    float oright = car.x() + car.width();
    float otop = car.y();
    float obottom = car.y() + car.height();

    return !(left >= oright ||
              right <= oleft ||
              top >= obottom ||
              bottom <= otop);
  }

  public boolean logCollision(Log log){

    float left = frog.x();
    float right = frog.x()+frog.width();
    float top = frog.y();
    float bottom = frog.y()+frog.height();

    float oleft = log.x();
    float oright = log.x() + log.width();
    float otop = log.y();
    float obottom = log.y() + log.height();


    return !(left >= oright ||
              right <= oleft ||
              top >= obottom ||
              bottom <= otop);
  }

  public void endGame(){
    p.endScene();
  }

  public void winGame(){
    p.winScene();
  }

}
