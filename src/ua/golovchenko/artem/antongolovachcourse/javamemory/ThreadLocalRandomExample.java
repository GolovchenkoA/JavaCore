package ua.golovchenko.artem.antongolovachcourse.javamemory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {

    private static int COUNT1 = 2;
    private static int COUNT2 = 4;
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        System.out.println(ThreadLocalRandom.current().nextInt(COUNT2));
        System.out.println(ThreadLocalRandom.current().nextInt(COUNT2));

        System.out.println(ThreadLocalRandom.current().nextInt(COUNT2));
        System.out.println(ThreadLocalRandom.current().nextInt(COUNT2));


        for(int i = 0; i < 1000; i++){
            int res = ThreadLocalRandom.current().nextInt(10);
            if (map.containsKey(res)){
                Integer value = map.get(res);
                value++;
                map.put(res, value);
            } else {
                map.put(res, 1);
            }
        }

        System.out.println(map);


    }
}
