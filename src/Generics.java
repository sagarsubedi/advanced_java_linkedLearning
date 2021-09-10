import java.util.ArrayList;
import java.util.List;

//generics is a way to tell the compiler what kind of objects a collection can contain
public class Generics {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};

//    we let objects in as params here. This is not generic method.
//    In this code, we can send integer array and store that back in String List which will be detected in run-time
//    and not in compile-time. To prevent that: (see next code)
//    public static List arrayToList(Object[] array, List<Object> list) {
//        for (Object object : array) {
//            list.add(object);
//        }
//        return list;
//    }
//  T is generic type. This is better as it will only return the same type List as the type of input

    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T object : array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
//        the output for both code is the same but for first one we have to cast to String
//        advantage os using Generics is that compiler checks for the object which makes the code safer


//        example without generics
        List names = new ArrayList();
        names.add("Sagar");
        String name = (String) names.get(0);
        System.out.println("Name: " +name);

//        example with generics
        List<String> names2 = new ArrayList();
        names2.add("Sagar");
        String name2 = names2.get(0);
        System.out.println("Name: " +name2);

//        let's see if adding int does something
//        it will give error for names2 as it needs String
//        names.add(7);
//        names2.add(7);

//        these 3 lines will turn array to List.
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());

//        for wildcards:
//        if there is a function that accepts List of Building objects but we want it such that we can pass anything that
//        extends Building class so that we can use its functions, we can do:
//        static void printBuildings(List<? extends Building> buildings)
//        now I can pass List of any object that extends Building class'

//        Similar to that: if we want to pass super types of a class and use its function in another class
//        static void addHoursToList(List<? super House> buildings)
//        this means that now I can pass objects of Building because Building is super clas of House


    }

}
