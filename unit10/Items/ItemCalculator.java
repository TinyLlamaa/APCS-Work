import java.util.*;

public class ItemCalculator{

  public static void printNamePrice(ArrayList<Item> items){

    for(int i = 0; i < items.size(); i++){

      Item a = items.get(i);
      System.out.println(a.getName());
      System.out.println(a.getPrice());
    }
  }

  public static float averagePrice(ArrayList<Item> items){

    float total = 0;

    for(int i = 0; i < items.size(); i++){

      Item a = items.get(i);
      total+=a.getPrice();
    }

    return total / items.size();
  }

  public static void averagePriceTest(ArrayList<Item> items, float expected){

    if(averagePrice(items) == expected){
      System.out.println("passed");
    } else{
      System.out.println("failed");
      System.out.println(averagePrice(items));
      System.out.println(expected);
    }
  }

  public static String mostExpensiveName(ArrayList<Item> items){

    float price = 0;
    String name = "";


    for(int i = 0; i < items.size(); i++){

      Item a = items.get(i);

      if(a.getPrice() > price){
        name = a.getName();
        price = a.getPrice();
      }
    }

    return name;

  }

  public static void mostExpeniveNameTest(ArrayList<Item> items, String expected){

    if(mostExpensiveName(items).equals(expected)){
      System.out.println("passed");
    } else{
      System.out.println("failed");
      System.out.println(mostExpensiveName(items));
      System.out.println(expected);

    }
  }

  public static void main(String[] args){

    ArrayList<Item> items = new ArrayList<Item>();
    Item dog = new Item("dog", 2009.98f);
    Item sponge = new Item("sponge", 5.99f);
    Item washingMachine = new Item("washing machine", 79.98f);
    Item bucket = new Item("bucket", 32.97f);
    items.add(dog);
    items.add(sponge);
    items.add(washingMachine);
    items.add(bucket);
    averagePriceTest(items, 532.23f);
    mostExpeniveNameTest(items, "dog");
    printNamePrice(items);

    ArrayList<Item> items1 = new ArrayList<Item>();
    Item cat = new Item("cat", 1.98f);
    Item broom = new Item("broom", 11.99f);
    Item dishwasher = new Item("dishwasher", 93.98f);
    Item chicken = new Item("chicken", 5.97f);
    items1.add(cat);
    items1.add(broom);
    items1.add(dishwasher);
    items1.add(chicken);
    averagePriceTest(items1, 28.48f);
    mostExpeniveNameTest(items1, "dishwasher");
    printNamePrice(items1);

  }
}
