class first{
    public int x;
    public void printA(){
        System.out.println("I am not a constructor");
    }
    public first(){
        System.out.println("I am an constructor");
    }
    public first(int a){
        System.out.println("I am an overloaded constructor "+ a+" is the value");
    }
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }
}
class second extends first{
    public int y;
    public second(){
        // super(4);
        System.out.println("I am an constructor of second class ");
    }
    public second(int a, int b){
        super(a);
        System.out.println("I am an overloaded constructor of second class "+ b+" and "+ a+ " is the value");
    }
    public void printB(){
        System.out.println("Hello");
    }
    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
}
class third extends second{
    public int z;
    public third(){
        System.out.println("I am constructor of third class");
    }
    public third(int a,int b, int c){
        super(a,b);
        System.out.println("I am constructor of third class "+a+" and "+ b+ " and " + c+" is the value");
    }
}
public class practice_28 {
    public static void main(String[] args) {
        // first a = new second(); if we use this then we use only first class
        // first a = new first();
        third c = new third();
        // a.setX(10);
        // a.setY(5);
        // System.out.print(a.getX());
        // System.out.println(a.getY());
        // a.printA();;
        // a.printB();
        // System.out.println(a);
        
        System.out.println(c);
        // System.out.println(c);

    }
    
}
