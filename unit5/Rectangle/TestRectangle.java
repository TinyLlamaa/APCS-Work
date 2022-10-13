public class TestRectangle{

  public static void main(String[] args){

    Rectangle r1 = new Rectangle(8, 29.3);
    testRectangle(r1, 234.4, 74.6, 30.37252047492931);

    Rectangle r2 = new Rectangle(1.2, 4.5);
    testRectangle(r2, 5.4, 11.4, 4.657252408878007);

    Rectangle r3 = new Rectangle(9.3, 8.74);
    testRectangle(r3, 81.282, 36.08, 12.76235088061757);

  }

  public static void testRectangle(Rectangle r, double expectedArea, double expectedPerimeter, double expectedDiagonal){

    System.out.println("base: " + r.getBase());
    System.out.println("height: " + r.getHeight());

    System.out.println("area: " + r.area());
    System.out.println("expected area: " + expectedArea);

    System.out.println("perimeter: " + r.perimeter());
    System.out.println("expected perimeter: " + expectedPerimeter);


    System.out.println("diagonal: " + r.diagonal());
    System.out.println("expected diagonal: " + expectedDiagonal);

    System.out.println(" ");
  }
}
