public class VarArgs {
    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        String item4 = "Pears";
        printShoppingList(item1, item2, item3, item4);

    }

//  usually we would write overloaded functions if we want to accept multiple parameters
//    but using variable arguments concepts, we don't have to do that.
//    I can pass as many args, and it will still work just fine
    private static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();

    }

}
