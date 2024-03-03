import java.util.Scanner;

public class practice_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           System.out.println("Enter how many times you run this code");
           int t = sc.nextInt();
        for(int j = 0; j <t ; j ++){
        System.out.println("Enter the value of a, b , n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            a = a + ((int)Math.pow(2,i)*b);
            System.out.print(a + " ");
        }
        System.out.println();
    }

    }
}
