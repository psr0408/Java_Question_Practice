import java.util.Scanner;

class practice_05 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner(System.in);
        boolean check;
        boolean check1;
        if (check = input.hasNextInt()) {

            System.out.println(" value is interger");
        } else if (check1 = input.hasNextFloat()) {
            System.out.println(" value is float");
        }
      else{
        System.out.println("You are not entered integer or flaot value");
      }
    }
}