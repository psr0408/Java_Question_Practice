interface camera{
    void photo();
    void recordVideo();
    private void greet(){
        System.out.println("Good morning");
    }
    default void record4K(){
        greet();
        System.out.println("Record 4k video");
    }
}
interface myWiFi1{
    String [] network();

}
class cellPhone{
    public void ring(){
       System.out.println("The phone is ringing");
}
    public void calling(String number){
       System.out.println("Calling "+ number);
}
}
class MyPhone extends cellPhone implements  myWiFi1, camera{

    @Override
    public void photo() {
        System.out.println("Clicking photo");
    }

    @Override
    public void recordVideo() {
       System.out.println("Record video");
    }

    @Override
    public String[] network() {
        System.out.println("The available wifi network are : ");
      String [] networkList = {"prashant", "harry","sushant"};
      return networkList;
    }

}
public class practice_33 {
   public static void main(String[] args) {
    MyPhone mp = new MyPhone();
    mp.calling("9305691522");
    mp.recordVideo();
    String [] ar =  mp.network();
    for(String item : ar){
        System.out.println(item);
    }
    mp.record4K();
   
    
   } 
}
