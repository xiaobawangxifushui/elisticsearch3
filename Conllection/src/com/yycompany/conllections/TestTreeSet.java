package com.yycompany.conllections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 < o2)
                    return -1;
                if (o1 > o2)
                    return 1;
                return 0;
            }
        });
        tree.add(10);
        HashSet hashSet = new HashSet();
        hashSet.add(1);
    }
}
