import java.util.Scanner;

class practice_08{
    public static void main(String[] args){
        String name = "Prashant Thakur";
       String name1 = name.toLowerCase();
        // System.out.println(name1);
        // System.out.println(name);
        // String name2 = name.toUpperCase();
        // System.out.println(name2);
        // System.out.println(name.trim());

        String name4 = "prashantthakurthakru";
        // System.out.println(name4.lastIndexOf("tha",11 ));

          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your name");
          String name5 = sc.nextLine();
          System.out.println(name5);
          int ans = name5.indexOf(" ");
          System.out.println(ans);
    }
}