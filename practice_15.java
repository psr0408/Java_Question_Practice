import java.util.Scanner;

public class practice_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many student");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];
        long[] mobile_no = new long[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of " + (i + 1) + " student");
            names[i] = sc.next();
            System.out.println("Enter the marks of that student");
            marks[i] = sc.nextInt();
            System.out.println("Enter the mobilel no");
            mobile_no[i] = sc.nextLong();
        }
        // System.out.println("The student data as follow: ");
        // System.out.println("No " + "Name "+"Mark "+ "Mobile_NO");
        // for (int j = 0; j < n; j++) {
        // System.out.printf("%d", 1+" ");
        // System.out.print(names[0]+ " ");
        // System.out.print(marks[0]+ " ");
        // System.out.print(mobile_no[0]+ " ");
        // }
        System.out.println("The data as follows: ");
        System.out.println("No  " + "Marks  " + "Mobile_no   " + "Name ");

        for (int j = 0; j < n; j++) {
            System.out.printf("%d   ", j + 1);
            System.out.print(marks[j] + "     ");
            System.out.print(mobile_no[j] + "  ");
            System.out.print(names[j] + "   ");
            System.out.println(" ");
        }
    }
}
