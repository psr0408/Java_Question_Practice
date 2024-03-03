public class practice_19 {
        public static void main(String[] args) {
         int [] arr = {1,2,3,4,5,4,3,43};
         int ans;
         int a = Math.floorDiv(arr.length,2);
           for(int i = 0; i<a; i++){
               ans = arr[i];
               arr[i] = arr[arr.length-i-1];
               arr[arr.length-i-1] = ans;
           }
           System.out.print("[");
          for(int e: arr){
            System.out.print(" "+e);
        }
        System.out.print(" ]");
        }
    }
    

