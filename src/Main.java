public class Main {

    public static void main(String[] args) {
//        this is to call certain classes and functions

//        let's use LambdaInterface class
//        First way is:
        LambdaInterface gm = new LambdaInterface() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name+ "!");
            }
        };

        gm.greet("Sagar");

//        now lets use Lambda, which make code shorter
//        ClassName objName = (params...) -> {body}
        LambdaInterface gm2 = (name) -> {
            System.out.println("Hello " +name+ "!");
        };
        gm2.greet("Sagar");
    }

}
