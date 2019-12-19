package com.yycompany.lambda;

import com.yycompany.fuctionalinterface.FctInterface;
import com.yycompany.fuctionalinterface.PrintInterface;

public class Lambda {
    private  int a;

    public Lambda(FctInterface fctInterface) {
        a=fctInterface.run();
    }


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Lambda{" +
                "a=" + a +
                '}';
    }
}
