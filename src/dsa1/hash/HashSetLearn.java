package dsa1.hash;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetLearn{
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search contains
        if(set.contains(1)){
      System.out.println("contains 1");
    }

        if(!set.contains(6)){
      System.out.println("not conatins 6");
        }

        //Delete
        set.remove(1);

    // size of the set
    System.out.println(set.size());

    System.out.println(set);

        Iterator it = set.iterator();
        while (it.hasNext()){
      System.out.println(it.next());
        }


  }
}

