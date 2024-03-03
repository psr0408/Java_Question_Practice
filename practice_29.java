class one{
    int a;

    public void meth1(){
        System.out.println("I am method 1 of class one");
    }
    public void meth2(){
        System.out.println("I am method 2 of class one");
    }
    // public void meth123(){
    //     System.out.println("I am method 123 of class one");
    // }
}
class two extends one{
     @Override
    public void meth2(){
        System.out.println("I am method 2 of class two");
    } 
    // public void meth123(){
    //     System.out.println("I am method 123 of class two");
    // } 
    public void meth2(int a){
        System.out.print("I am method 2 of class one");
        System.out.println("The value is: "+ a);
    } 
    public void meth12(){
        System.out.println("I am method 12 of class two");
    }
   
}
public class practice_29 {
    public static void main(String[] args) {
        //  two t = new two();
        //  t.meth1();
        //  t.meth2(4);
        //  t.meth12();
         one a = new two();
         a.meth1();
         a.meth2();
        //  a.meth123();
    }
}
