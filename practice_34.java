interface hari{
     private void hi(){
        System.out.println("Hello a");
    }
    default void hari(){
        hi();
        System.out.println("Hello hari 56");
    }
     abstract void name();
     abstract void age();
}
class rahul implements hari{
    public void name(){
        System.out.println("The name is hari");
    }
    public void age(){
        System.out.println("The age is 24");
    }
    
}
public class practice_34 {
    public static void main(String[] args) {
           rahul r = new rahul();
           r.age();       
           r.name();       
           r.hari();
          

    }
}
