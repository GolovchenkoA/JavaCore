package ua.golovchenko.artem.antongolovachcourse.javamemory;

public class WithAndWithoutLeakMemoryExample {
    public static void main(String[] args) {

        withoutleakMemoryExample();

    }

    /**
     * In this method ref refers to last created object.
     * Other objects that have been created are deleted by the garbage collector
     */

    private static void withoutleakMemoryExample() {
        // creating local variable in Stack and new Object[] (in Heap). Once
        // array length 1
        Object[] ref = new Object[1];

        while(true){
            // creating new Object (in Heap). Multiple times
            // First element of the ref-array refers to new object that have been created
            ref[0] = new Object[1];
            // Now ref-array itself refers to object that have been created.
            // Obtain the reference from first element of ref-variable
            ref = (Object[]) ref[0];
        }
    }


}
