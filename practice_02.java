import java.util.Scanner;

public class practice_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Star Pattern\n2. Reverse Star Pattern");
        int b = sc.nextInt();
        if (b == 1) {
            System.out.println("Enter the value you want star line");
            int a = sc.nextInt();
            System.out.println("The star pattern is : ");

            for (int i = 0; i < a; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.printf("*");
                }
                System.out.println("");
            }
        } else if (b == 2) {
            System.out.println("Enter the value you want star line");
            int a = sc.nextInt();
            System.out.println("The reverse star pattern is :");

            for (int i = 0; i < a; i++) {
                for (int j = a; j > i; j--) {
                    System.out.printf("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Enter correct choice");

        }

    }
}
