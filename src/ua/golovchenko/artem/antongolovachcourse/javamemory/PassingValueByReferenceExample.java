package ua.golovchenko.artem.antongolovachcourse.javamemory;

/**
 * Passing value by reference
 * inside printString method jvm create local variable that refers to the method parameter
 */
public class PassingValueByReferenceExample {
    public static void main(String[] args) {
        String str = "My String";

        printString(str);
        System.out.println("Main Pring: " + str);


    }

    public static void printString(String str){
        int i = 5;
        System.out.println("printString: " + str);
        str = null;
    }
}
