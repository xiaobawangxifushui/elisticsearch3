package clazz;

import java.lang.reflect.Method;

public class TestClaszz {
    public static void main(String[] args) {
        Class<String> stringClass = String.class;
        Method[] declaredMethods = stringClass.getDeclaredMethods();
        for (Method metod:declaredMethods ) {
            System.out.println(metod.getName());
        }
        Runnable r = ()-> System.out.println("eee");

    }
}
