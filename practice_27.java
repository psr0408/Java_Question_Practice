class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        this.length = 4;
        this.breadth = 5;
    }
    public rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    public int getBreadth(){
        return breadth;
    }
    public int getHeight(){
        return length;
    }
}
public class practice_27 {
    public static void main(String[] args) {
     rectangle r = new rectangle();
        System.out.println(r.getBreadth());
    }
}
