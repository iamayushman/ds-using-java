import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;

public class MyList {
    public static void main(String[] args) {
        Integer a[] = { 1, 2, 3, 4, 54, 6, 8 };
        List al = Arrays.asList(a);
        System.out.println(al.getClass().getTypeName());
        al.stream().forEach(System.out::println);
        // ArrayDeque ll = new ArrayDeque();
        // ll.add("4");
        // ll.add("2");
        // ll.add("3");
        // ll.add("8");
        // ll.pop();
        // ll.push("5");
        // // System.out.println();
        // ll.stream().forEach(System.out::println);

        // PriorityQueue ll = new PriorityQueue<>();
        // ll.add(4);
        // ll.add(8);
        // ll.add(2);
        // ll.add(3);
        // ll.add(1);
        // // System.out.println();
        // ll.stream().forEach(System.out::println);

        // List<String> l = new ArrayList<String>();
        // l.add("b");
        // l.add("a");
        // l.add("d");
        // l.add("c");
        // ListIterator li = l.listIterator();
        // while (li.hasNext()) {
        // System.out.println(li.previous());
        // }

        // Hashtable<Integer, String> l = new Hashtable();
        // l.put(1, "b");
        // l.put(2, "a");
        // l.put(3, "d");
        // l.put(4, "c");
        // for (Map.Entry<Integer, String> i : l.entrySet()) {
        // System.out.println("" + i.getKey() + "" + i.getValue());
        // }
        
    }
}