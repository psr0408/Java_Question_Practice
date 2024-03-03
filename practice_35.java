class MThread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<50){
        System.out.println("PRASHANT SINGH THAKUR");
        i++;
    }
}
}
class MThread2 extends Thread{

    public void run(){
        int i = 0;
        while(i<50){
        System.out.println("SUSHANT SINGH RAJPUT");
        i++;
    }
}
}
public class practice_35 {
    public static void main(String[] args) {
        MThread1 m1 = new MThread1();
        MThread2 m2 = new MThread2();
        m1.start();
        m2.start();
    }
}
