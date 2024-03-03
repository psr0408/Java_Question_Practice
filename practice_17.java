public class practice_17 {
    public static void main(String[] args){
          int [] a = {1,2,3,4,6,76,868,76};
          int b = Integer.MIN_VALUE;
          int c = Integer.MAX_VALUE;
        //   int c;
          for(int e: a){
              if(e>b){
                b = e;
            }
        }
        System.out.println(b);
        
        for(int t: a){
            if(t<c){
                t = c;
            }
        }
        System.out.println(c);
    }
}
