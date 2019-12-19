package com.yycompany.conllections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cllction {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Iterator<Integer> iterator = list.iterator();
        list.remove(2);
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next+"  麻雀~~~");
        }
    }
}
