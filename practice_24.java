class Employee_1{
    int salary;
    String name;
    public int getSalary(){
              return salary;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
             return name;
    }
}

class Square{
    int side;
      public int area(){
           return side * side;
      }
      public int perimeter(){
          return 4*side;
      }
}

public class practice_24 {
    public static void main(String[] args){
        Employee_1 prashant = new Employee_1();
        prashant.salary = 45;
        prashant.name = "Prashant";
        prashant.setName("PRASHANT THAKUR");
        // System.out.println(prashant.getName());
        // System.out.println(prashant.getSalary());
        Square sq = new Square();
        sq.side= 4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
}
