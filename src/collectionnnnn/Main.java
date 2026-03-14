package collectionnnnn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(80);
    System.out.println(list.get(2));
    System.out.println(list.size());
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }


}
