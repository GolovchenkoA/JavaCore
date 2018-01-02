package ua.golovchenko.artem.antongolovachcourse.javamemory;

public class HeapLeakMemoryExample {
    public static void main(String[] args) {
        Object[] ref = new Object[1];

        while(true){
            //ref = new Object[]{ref}; //slow
            ref = new Object[]{ref, new byte[124 * 1024]}; //fast
        }

        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
    }
}
