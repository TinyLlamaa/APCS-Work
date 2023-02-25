import java.util.*;

public class ShapeCollection{

  private ArrayList<Shape> shapes;

  public ShapeCollection(){

    shapes = new ArrayList<Shape>();

  }

  public static void main(String[] args){

    ShapeCollection collection = new ShapeCollection();

    collection.addShape("Linda", 3);
    collection.addShape("Charley", 4);
    collection.addShape("Maddie", 6);
    collection.addShape("Alexa", 5);
    collection.addShape("Justine", 8);
    collection.addShape("Grace", 3);
    collection.addShape("Zoe", 5);
    collection.addShape("Val", 6);
    collection.addShape("Ruby", 8);

    System.out.println(collection.getArray());

    System.out.println("findSides: " + collection.findSides("Linda"));
    System.out.println("avgSides: " + collection.avgSides());
    System.out.println("evenSides: " + collection.evenSides());

  }

  public void addShape(String name, int sides){
    Shape a = new Shape(name, sides);
    shapes.add(a);
  }

  public ArrayList<Shape> getArray(){
    return shapes;
  }

  public int findSides(String name){

    int result = 0;

    for(int i = 0; i < shapes.size(); i++){
      if(name.equals(shapes.get(i).getName())){
        result = shapes.get(i).getSides();
      }
    }

    return result;

  }

  public int avgSides(){

    int total = 0;

    for(int i = 0; i < shapes.size(); i++){
      total+=shapes.get(i).getSides();
    }

    return total / shapes.size();

  }

  public ArrayList<Shape> evenSides(){

    ArrayList<Shape> result = new ArrayList<Shape>();

    for(int i = 0; i < shapes.size(); i++){
      if(shapes.get(i).getSides() % 2 == 0){
        result.add(shapes.get(i));
      }
    }

    return result;

  }

}
