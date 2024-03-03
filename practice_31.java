abstract class parentt{
    public void Hello(){
        System.out.println("Hello");
    }
    public void parentt(){
        System.out.println("hi ");
    }
     abstract public void wish();

     
    abstract public void wish1();
}

class children extends parentt{
    @Override
    public void wish() {
        System.out.println("Good Morning");
        
        
    }
    public void wish1() {
        System.out.println("Good Afternoon");       
    }
    public void wish2() {
        System.out.println("Good Evenning");       
    }
}

public class practice_31 {
    public static void main(String[] args) {
    children c = new children();
    c.wish();
    c.wish1();
    c.wish2();
    c.Hello();
        
    }
}
