import java.util.Scanner;

public class practice_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Reverse star pattern\n2. To print first n even number sum\n3. To print multiplication table\n4. To calculate fractional value");
        byte a = sc.nextByte();
        switch(a){
            case 1:
        for(int i = 0; i<=4; i++){
            for(int j = 4; j>=i; j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        break;
        case 2:
        int sum = 0;
        int n;
        System.out.println("Enter the value of n");
        n = sc.nextInt();
        for(int i =0; i<=n; i++){
            sum = sum + (2*i);

        }
        System.out.println(sum);
        break;
        case 3:
        System.out.println("Enter the number you want table");
        byte b = sc.nextByte();
        for(int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",b, i, b*i );
        }
        break;
        case 4:
        System.out.println("Enter the number you want fractional");
        byte c = sc.nextByte();

        int factorial= 1;
        for(int i=c; i>=1; i--){
          factorial = factorial * i;
        }
        System.out.println(factorial);
        break;
        default:
        {
            System.out.println("Enter correct value");
        }
    }
}
}
