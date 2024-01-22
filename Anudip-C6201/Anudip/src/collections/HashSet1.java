package collections;

import java.util.HashSet;

public class HashSet1 {
	
    public static void main(String[] args) {
        /*
         * HashSet implements set interface.
         * 
         * Properties:-
         * 1) Duplicates are not allowed.
         * 2) Insertion order not maintained.
         * 3) Members are not sorted.
         * 4) Only one null value is allowed.
         */

         HashSet<String> hs = new HashSet<String>();
         hs.add("Pen");
         hs.add("Eraser");
         hs.add("Sharpner");
         hs.add(null);
         hs.add("Protector");
         hs.add("Scale");
         hs.add("Sharpner");
         hs.add("Protector");

         System.out.println(hs);
    }
    
}
