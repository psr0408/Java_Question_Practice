class Employ{
    int id;
    int salary;
    String name;
      public void printDetail(){
        System.out.println("The id is: "+ id);
        System.out.println("The Name is: "+ name);
      }
      public int getSalary(){
        return salary;
      }
}
public class practice_23 {
    public static void main(String[] args){
          Employ prashant = new Employ();
          prashant.id = 45;
          prashant.salary = 45000;
          prashant.name = "Prashant";
          prashant.printDetail();
          System.out.println(prashant.getSalary());
    }
}
