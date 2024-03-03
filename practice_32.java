interface Cycle{ 
    int a = 45;
    public void horn();
    public void speedup();
 }
 interface Cycle1{
   public void speedlow(int speed);
}

class ACycle implements Cycle, Cycle1{
    //  int speed =50;
    @Override
    public void horn() {
       System.out.println("blow horn");
    }

    @Override
    public void speedup() {
        System.out.println("Speed up");
        // speed = speed + a;
    }

    @Override
    public void speedlow( int speed) {
       System.out.println("Speed low");
       int b ;
       b  =  speed - a;
      System.out.println(b);
      System.out.println(a);
    }
    
}
public class practice_32 {
    public static void main(String[] args) {
         ACycle a = new ACycle();
         a.speedup();
         a.speedlow(50);

    }
}
