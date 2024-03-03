import java.util.Scanner;

public class practice_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // int  sc.nextInt();
        int [][] a = new int [n][m];
        int [][] b = new int [n][m];
        int [][] ans = new int [n][m];
        // System.out.println("")
        System.out.println("Enter value");
        for(int i =0; i<n;i++){
            for(int j = 0 ; j<m;j++){
                System.out.println(i+" " + j);
                a[i][j] = sc.nextInt(); 
            }
        }
        System.out.println("Enter second matrix");
        for(int i =0; i<n;i++){
            for(int j = 0 ; j<m;j++){
                System.out.println(i+" " + j);
                b[i][j] = sc.nextInt(); 
            }
        }
        for(int i =0; i<n;i++){
            for(int j = 0 ; j<m;j++){
                // System.out.println(i+" " + j);
                ans[i][j] =  a[i][j] + b[i][j];
            }
        }
        System.out.println("The result is: ");
        for(int i =0; i<n;i++){
            for(int j = 0 ; j<m;j++){
                System.out.print(" "+ans[i][j]);
                // ans[i][j] =  a[i][j] + b[i][j];
            }
            System.out.println();
        }
        

    }
}
