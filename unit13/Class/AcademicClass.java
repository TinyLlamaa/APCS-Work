import java.util.*;

public class AcademicClass{

  private Teacher teacher;
  private ArrayList<Student> students;

  public AcademicClass(){

    teacher = new Teacher("Dr. Kessner", "APCS");
    students = new ArrayList<Student>();

  }

  public static void main(String[] args){

    AcademicClass apcs = new AcademicClass();

    apcs.addStudents("Sarah", 21);
    apcs.addStudents("Madeleine", 6);
    apcs.addStudents("Logan", 7);
    apcs.addStudents("Ramya", 14);
    apcs.addStudents("Riley", 46);
    apcs.addStudents("Allie", 6);
    apcs.addStudents("Chase", 6);

    apcs.printInfo();
    System.out.println(apcs.favIntNames(6));
    System.out.println(apcs.oddFavInt());

  }

  public void addStudents(String name, int favNum){

    Student a = new Student(name, favNum);
    students.add(a);

  }

  public void printInfo(){

    System.out.println(teacher.getName() + " " + teacher.getSubject());

    for( Student a : students){
      System.out.println(a.getName() + " " + a.getFavNum());
    }
  }

  public ArrayList<String> favIntNames(int n){

    ArrayList<String> result = new ArrayList<String>();

    for(int i = 0; i < students.size(); i++){
      if(students.get(i).getFavNum() == n){
        result.add(students.get(i).getName());
      }
    }

    return result;

  }

  public ArrayList<String> oddFavInt(){

    ArrayList<String> result = new ArrayList<String>();

    for(int i = 0; i < students.size(); i++){
      if(students.get(i).getFavNum() % 2 != 0){
        result.add(students.get(i).getName());
      }
    }

    return result;

  }
}
