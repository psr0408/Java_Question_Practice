import java.util.ArrayList;
import java.util.LinkedList;

public class practice_36 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l2.add(6);
        l2.add(7);
        l2.add(8);
        l2.add(9);
        l2.add(10);
        l2.addAll(l1);
        l1.clear();
        for(int i: l2){
            System.out.print(i+", ");
        }

    }

}
