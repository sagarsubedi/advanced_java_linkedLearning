import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class CollectionsFramework {
//    think about Ordering, Duplicates, Speed, and Memory Use when choosing Collections
//    Interface that defines Collections; Iterable
//    Then Collection interface extends Iterable
//    Collection implements functions that every collection needs
//    After this, there are Set, List, and Queue
//    Set don't allow duplicate, and they are unordered
//    Queue uses FIFO operation
//    Maps don't extend Collection but are great for use

    public static void main(String[] args) {

//        Linked list hold reference of previous and next items
        LinkedList<String> myList = new LinkedList();
        myList.add("a");
        myList.add("b");
        myList.add("d");
        myList.add(2, "c");

        System.out.println(myList);
//        myList.remove("d");
//        Both linkedList and ArrayList implement List
//        linkedList takes more space.

//        Queue
//        useful for controlling access to shared resource like CPU tasks, landing airplanes, etc.
//        LinkedList uses Queue by default


        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Sagar", 919293);
        phoneBook.put("Sikshya", 12312);
//        hasmap are unordered so output might not be in the same order
//        can't have two same key. if done, it will override and put latest value
        System.out.println(phoneBook);
//        check if hasmap has a key
        System.out.println(phoneBook.containsKey("Sagar"));
//        phoneBook.remove("Sagar"); will delete specific key as supplied
//        phoneBook.clear(); will delete everything

//        LinkedHashMap will have order
        LinkedHashMap<String, Integer> phoneBookOrdered = new LinkedHashMap<>();
//        another way with 3 params:
//          1st will be the initial size
//          2nd will be the load factor that specifies how full the map can be before it is made bigger 0.75f means
//              when 75% it will expand
//          3rd is the order. false is insertion which returns elements as they were inserted.
//              true means access order. The one accessed most recently will be at the bottom



    }

}
