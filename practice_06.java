import java.util.Scanner;

class practice_06 {
    public static void main(String[] args) {
        // int y = 7;
        // int x = ++y * 8;
        // System.out.println(x);

        // char a = 'B';
        // a++;
        // System.out.println(a);
        // a--;
        // System.out.println(--a);
        // System.out.println(a);

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of x");
        // int x = sc.nextInt();
        // System.out.println("Enter the value of y");
        // // Scanner sc1 = new Scanner(System.in);
        // int y = sc.nextInt();
        // double a = x - y;
        // double ans1= a/2;
        // System.out.println(ans1);

        // System.out.println("Enter the value of b");
        // int b = sc.nextInt();
        // System.out.println("Enter the value of a");
        // int a = sc.nextInt();
        // System.out.println("Enter the value of c");
        // int c = sc.nextInt();
        // int ans = (b*b) - (4*a*c);
        // double ans1 = ans/(2*a);
        // System.out.println(ans1);

        // System.out.println("Enter the value of b");
        // int b = sc.nextInt();
        // System.out.println("Enter the value of a");
        // int a = sc.nextInt();
        // double ans = (b * b) - a * a;
        // System.out.println(ans);

        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of d");
        int d = sc.nextInt();
        int ans = a * b - d;
        System.out.println(ans);

    }
}