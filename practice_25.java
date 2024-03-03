class Emp{
   private int id;
   private String name;
    public void setName(String n){
        this.name = n;
    }
    public void setId(int n){
        this.id = n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void getName1(){
        System.out.println(name);
    }
}
public class practice_25 {
    public static void main(String[] args) {
        Emp pr = new Emp();
        pr.setId(45);
        pr.setName("Prashant");
        System.out.println(pr.getId());
        System.out.println(pr.getName());
        pr.getName1();
    }
}
