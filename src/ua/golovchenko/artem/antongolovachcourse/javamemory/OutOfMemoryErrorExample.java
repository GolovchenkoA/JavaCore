package ua.golovchenko.artem.antongolovachcourse.javamemory;

public class OutOfMemoryErrorExample {
    public static void main(String[] args) {
        long[] a = new long[Integer.MAX_VALUE]; // 2147483647 * 8 byte = 16 GB
        //Exception in thread "main" java.lang.OutOfMemoryError: Requested array size exceeds VM limit
    }
}
