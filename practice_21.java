import java.util.Scanner;

public class practice_21 {
    // Scanner sc = new Scanner(System.in);

    int sum(int a, int b) {
        if (a > b) {
            return a + b;
        } else {
            return b;
        }
    }

    static void multiple(int a) {
        // int c = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", a, i, a * i);
        }

    }

    static void change(int a) {
        a = 75;
    }

    static void change1(int[] a) {
        a[0] = 75;
        a[1] = 73;
    }

    static int total(int... arr) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the length of array");
            int a = sc.nextInt();
            arr = new int[a];
            System.out.println("Enter the values of array");
            for (int i = 0; i < a; i++) {
                arr[i] = sc.nextInt();

            }
        }
        int sum = 0;
        for (int e : arr) {
            sum += e;
        }
        return sum;
    }

    static void reverseArray(int... arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int a = sc.nextInt();
        arr = new int[a];
        int e;
        int b = Math.floorDiv(a, 2);
        System.out.println("Enter the values of array");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < b; i++) {
            e = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = e;
        }
        // System.out.print("[");
        // for(int t: arr){
        // System.out.print(t+",");
        // }
        // System.out.print("]");
        // // return a;

        System.out.print("[");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]);
        //     if (i == arr.length-1 ) {
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i-1]);
            if (i == arr.length ) {

            } else {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        sc.close();

    }

    public static void main(String[] args) {
        // practice_21 obj = new practice_21();
        // int a =obj.sum(4,5);
        // System.out.println(a);
        // System.out.format(multiple(6));
        // multiple(6);
        // int x = 78;
        // change(x);
        // System.out.println(x);
        // int [] arr = { 12,33,53,63,78,866,67};
        // change1(arr);
        // for(int i : arr){
        // System.out.print(i+" ");
        // int ans =total(4,5,4,4,4,4,4,4);
        // System.out.println(ans);

        // System.out.println(total());
        reverseArray();
        
    }
}
