public class Main
{
        public static void main(String[] args)
        {
                String name = "Herkules";
                String efternavn = "Kattepine";
                myInterfaceHandler(name, efternavn);

                MyFrame myFrame = new MyFrame();

        }

        public static void myInterfaceHandler(String name, String efternavn)
        {
                /*
                A Lambda expression can be used in any place where a functional interface is required
		how to use a lambda expression:
		(arguments) -> {statement/s}
                 */

                // this is to show different versions of lambda expressions
                // these are implementations of the functional interface
                MyInterface myInterface = (x) -> System.out.println("Whatever whenever! jeg hedder " + x);
                //implementation of functional interface (using the lambda) with more than one line of code
                MyInterface myInterface1 = (y) ->
                {
                        System.out.println("Jeg hedder hundefar!!");
                        System.out.println("måske jeg også hedder: " + y);
                };
                //implementation with lambda with two arguments
                MyInterface2 myInterface2 = (x, y) -> System.out.println("EJg hedder det følgende som sådan: " + x + " " + y);

                myInterface.message(name);
                myInterface1.message(name);
                myInterface2.message(name, efternavn);

        }
}