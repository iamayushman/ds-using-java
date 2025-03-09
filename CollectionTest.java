import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

  public static void main(String[] args) {
    // Java Collection
    // List
    List<String> list = new ArrayList<String>();
    list.add("b");
    list.add("ba");
    list.add("s");
    list.add("0");
    Iterator<String> itr = list.iterator();
    //

    System.out.println("Print using while loop and iterator");
    while (itr.hasNext()) {
      System.out.print(itr.next());
    }

    System.out.println("Print using for loop");
    for (String item : list) {
      System.out.print(item + ", ");
    }
    list.stream().forEach(System.out::println);

    list.sort(Comparator.comparing(String::valueOf));
    System.out.println("After Sort");
    list.stream().forEach(System.out::println);

    list.sort(Comparator.comparing(String::valueOf).reversed());

    System.out.println("After Sort");
    list.stream().forEach(System.out::println);

    list.clear();
    System.out.println("After Clear");
    list.stream().forEach(System.out::println);
    // Queue

    // Map

    // Set
    System.out.println("TreeSet");
    Set<String> treeSet = new TreeSet();
    treeSet.add("b");
    treeSet.add("ba");
    treeSet.add("s");
    treeSet.add("g");
    treeSet.add("a");
    treeSet.add("1");
    treeSet.stream().forEach(System.out::println);

    System.out.println("After Sort");
    treeSet.stream().forEach(System.out::println);

  }
}
