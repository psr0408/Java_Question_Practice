import java.util.Random;
import java.util.Scanner;

public class practice_16 {
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(0, 101);
        Scanner sc = new Scanner(System.in);
        System.out.println("The value of a  is : " + a);
        // System.out.println("Enter the number");
        // int b = sc.nextInt();
        int b;
        int noa = 0;
        boolean and = true;
        // if(a==b){
        // System.out.println("Enter number is: "+ a);
        // }
        // else{
        while (and) {
            System.out.println("Enter the number");
            b = sc.nextInt();
            noa++;
            // continue;
            if (a == b) {
                System.out.println("The value is: " + a);
                System.out.println("The no of attemp is: " + noa);
                and = false;

            }
        }

        // }
    }
}
