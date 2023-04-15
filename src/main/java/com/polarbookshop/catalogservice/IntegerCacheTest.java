package com.polarbookshop.catalogservice;

import java.lang.reflect.Field;

// This test maybe not correct anymore.
public class IntegerCacheTest {

    public static void main(String[] args) throws Exception {
        doSomethingMagic();
        System.out.printf("2 + 2 = %d", 2 + 2);
    }
    private static void doSomethingMagic() throws Exception {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = array[133];
    }
}
