class practice_01{
    public static void main(String[] args){
        int a = 5;
        while(a>4){
            System.out.println(a);
            a++;
            if(a==10000000){
                break;
            }
        }
    }
}