import java.util.ArrayList;

public class Streams {
//    uses internal iteration as opposed to forEach()
//    assume we have Book class with (String author, String title);
//    assume we have Library class that has ArrayList of Book's objects
//    in Library's main, let's say we want to print books that has authors whose name starts with K=J
//    using streams, we can do:

//    in Library's main:
//    ArrayList<Book> books = populateLibrary(); this function will return arraylist of books
//    books.stream().filter(book -> {
//      return book.getAuthor().startsWith("J");
//    }).forEach(System.out::println);

//    Or we can also do:
//    books.stream().filter(book -> {
//      return book.getAuthor().startsWith("J");
//    }).filter(book -> {
//      return book.getTitle().startsWith("E");
//    }).forEach(System.out::println);

//    the code above will first filter author who start with J and then their books that starts with E
//    if we did forLoop then we would have to do inner loops

//    Implementing parallel streams
//    so that multiple cores can be used to do the task i.e. filter
//    only thing we need to do is change stream to parallelStream()
//    books.parallelStream().filter(book -> {
//      return book.getAuthor().startsWith("J");
//    }).forEach(System.out::println);
//    it is faster but only when dataset is large
//    this code is also dependent on how many cores we have in the machine




}
