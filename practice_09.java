import java.util.Random;
import java.util.Scanner;

class practice_09{
    public static void main(String[] args){
        Random rn = new Random();
        int a = rn.nextInt(1,4);
        System.out.println("1. Rock\n2. Paper\n3. Scissor");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        if(a==b)
        {
            System.out.println("Draw");

        }
         else if(a == 1 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1){
            System.out.println("You win the game");
         }
        else if(a == 1 && b == 3 || a == 2 && b== 1 || a == 3 && b == 2)
        {
            System.out.println("You loose the game");
        }
   else{
    System.out.println("you entered wrong input");
   }
        
   System.out.println("Your input is: " + b);
   System.out.println("Computer input is: " + a);

        
    }
}