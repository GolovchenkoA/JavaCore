package ua.golovchenko.artem.antongolovachcourse.javamemory;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetContainsAnySetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("s1");
        set1.add("s2");
        set1.add("s3");

                Set<String> set2 = new HashSet<>();
        set2.add("s1");
        set2.add("ss2");
        set2.add("ss3");

        System.out.println(Collections.disjoint(set1, set2));
        System.out.println(set1.stream().anyMatch(set2::contains));


    }
}
