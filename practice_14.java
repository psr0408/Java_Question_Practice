public class practice_14 {
    public static void main(String[] args) {
        // int [] a = {1,2,3,4,5,6,7};
        // boolean ans = false;
        // int value = 5;
        // for(int b : a){
        // if(b==value){
        // ans = true;
        // break;
        // }

        // }

        // if(ans){
        // System.out.println("The value is present");
        // }
        // else{
        // System.out.println("The value is not present");
        // }

        // int[][] mat1 = { { 1, 2, 3 },
        // { 4, 5, 6 } };
        // int[][] mat2 = { { 1, 2, 2 },
        // { 4, 5, 2 } };
        // int[][] result = { { 0, 0, 0 },
        // { 0, 0, 0 } };
        // for(int i = 0; i<mat1.length; i++){
        // for(int j = 0; j<=mat2.length;j++){
        // result[i][j] = mat1[i][j] + mat2[i][j];
        // System.out.print(result[i][j]+ " ");
        // }
        // System.out.println("");
        // }

        // int [] a = {34,546,647,46,35,64,46,735,63,45};
        // int b = Math.floorDiv(a.length,2);
        // // System.out.println(b);
        // int temp;
        // int l = a.length;
        // for(int i = 0; i<b; i++){
        // temp = a[i];
        // a[i] = a[l-i-1];
        // a[l-i-1] = temp;

        // }
        // for(int e : a){
        // System.out.print(e+" ");
        // }

        int [] array = {11,24,54,757,1,35,3553,53,535,53};
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        // int max= 0;
        // System.out.println(a);
        for(int e : array){
        if(e<a){
        a = e;
        System.out.println(a);
        }
        }
        // System.out.println(a);
        // for(int e : array){
        // if(e>b){
        // b = e;
        // }
        // }
        // System.out.println(b);

//         int[] a = { 1, 2, 5, 34, 5, 345, 353 };
//         boolean ans = true;
//         for (int i = 0; i < a.length - 1; i++) {
//             if (a[i] > a[i + 1]) {
//                 ans = false;
//             }

//         }
//         if (ans) {
//             System.out.println("Sorted");
//         } else {
//             System.out.println("Not sorted");
//         }

    }
}
