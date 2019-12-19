package com.yycompany.test;

import com.yycompany.fuctionalinterface.FctInterface;
import com.yycompany.fuctionalinterface.PrintInterface;
import com.yycompany.lambda.Lambda;
import com.yycompany.lambda.PrintLambda;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        int a = new Lambda(() ->1).getA();
        System.out.println(a);
        int c =2;
        new PrintLambda(new PrintInterface() {
            @Override
            public void run(int a) {
                System.out.println(a);
            }
        });
        //new PrintLambda((c)->System.out.println(c+1));



       // System.out.println("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");


        //List<String> list = Arrays.asList("java","c","python","c++","VB","C#");
      //  list.forEach(s -> System.out.println(s));

    }
}
