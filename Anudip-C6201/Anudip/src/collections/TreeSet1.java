package collections;

import java.util.TreeSet;

public class TreeSet1 {
	
    public static void main(String[] args) {
        /*
         * TreeSet implements SortedSet interface. SortedSet extends set interface.
         * 
         * Properties:-
         * 1) Duplicates are not allowed.
         * 2) Insertion order is not maintained.
         * 3) Members are sorted.
         * 4) Null value not allowed.
         */
        TreeSet<Double> ts = new TreeSet<Double>();
        ts.add(5.94);
        ts.add(0.5);
        ts.add(6.2);
        ts.add(7.94);
        //ts.add(null);  NullPointerException
        ts.add(4.94);

        System.out.println(ts);
    }
    
}
