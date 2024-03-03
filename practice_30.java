class Circle1{
     int radius;
      Circle1(){
        System.out.println("I am circle parameterized construstor");
        // this.radius=a;
      }
      public void setradius(int radius){
        this.radius = radius;
    }
    public double getradius(){
        return Math.PI*this.radius*this.radius;

    }
      public double area(){
        // return Math.PI*radius*radius;
        return Math.PI*this.radius*this.radius;
      }

}
class Cylinder1 extends Circle1{

    Cylinder1(int r,int h) {
        // super(r);
   System.out.println("I am cylinder constructor");
   this.height = h;
    }
    public int height;
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }

}
public class practice_30 {
    public static void main(String[] args) {
        Circle1 c = new Circle1();
        // c.radius(4);
         c.radius = 5;
     
        System.out.println(c.getradius());
        System.out.println(c.area());

        // Cylinder c = new Cylinder(3, 4);
        // System.out.println(c.volume());
    }
}
