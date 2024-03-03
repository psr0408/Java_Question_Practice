import java.util.Scanner;

class practice_10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("Please entered number between -125 to 125") ;
       byte a = sc.nextByte();
      
     boolean y= true;
     while(y) {
      switch(a){
        case 1:
        System.out.println("One");
        System.out.println("Enter a website address");
        String web = sc.next();
        boolean ans = true;
        boolean t  = web.endsWith(".org");
        boolean t1  = web.endsWith(".com");
        boolean t2  = web.endsWith(".gov");
        if(ans==t){
        System.out.println("This is a organizational website");
        break;
        }
        else if(ans==t1){
            System.out.println("This is a commerical website");
            break;
        }
        if(ans==t){
        System.out.println("This is a organizational website");
        break;
        }
      else  if(ans==t2){
        System.out.println("This is a governtment website");
        break;
        }
        else{

            System.out.println("The data is not provided");
            // break;
        }
        break;
        case 2:
        System.out.println("Two");
        break;
        default:
        System.out.println("Not in code");
      }
    }
    }
}