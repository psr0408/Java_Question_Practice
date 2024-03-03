public class practice_13 {
    public static void main(String[] args){
        // hasNext(); method in java
        // int [] marks = new int[5];
        // marks[0] = 12;
        // marks[1] = 13;
        // marks[2] = 14;
        // marks[3] = 15;
        // marks[4] = 16;
        // for(int i = 0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // }
        // for(int e:  marks){
        //     System.out.println(e);
        // }

        int [][] ma = new int [2][3];
        ma[0][0] = 11;
        ma[0][1] = 12;
        ma[0][2] = 13;
        // ma[0][3] = 13;
        ma[1][0] = 21;
        ma[1][1] = 22;
        ma[1][2] = 23;
        for(int i = 0; i<ma.length; i++){
            for(int j = 0; j<3; j++){
                System.out.print(ma[i][j] + " ");
            }
            System.out.println("");
        }
             System.out.println(ma.length);
    }
}
