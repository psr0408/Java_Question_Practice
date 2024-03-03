import java.util.Scanner;
class practice_04{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name");
    String name = input.nextLine();
    int A[] = new int[5];
    for(int i = 0; i<5; i++){
        System.out.printf("Enter your marks of %d subject ", i+1);
        A[i] = input.nextInt();
    }
    int total = A[0]+A[1]+A[2]+A[3]+A[4];
    float total_mark = total/5f;
    System.out.println("Hello, " + name);
    // System.out.println("");
    System.out.printf("Your percentage is : %f", total_mark);
    }
}