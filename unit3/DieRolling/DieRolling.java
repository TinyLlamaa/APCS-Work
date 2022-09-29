public class DieRolling{

  public static void main(String[] args){

  for(int i = 0; i < 50; i++){
    System.out.println(DieRolling());
  }
  }

  public static int DieRolling(){
    double roll = Math.floor(Math.random() * 7);

    if(roll == 0){
      roll = 1;
    }

    return (int)roll;
    }
  }
