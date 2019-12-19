package io;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class fileio {

    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File("F:/dd/aa.txt"));
            FileOutputStream fileOutputStream = new FileOutputStream(new File("F:/dd/a.txt"));

//            byte[] b = new byte[3];
//            int a;
//            while ((a=fileInputStream.read(b))!=-1){
//                fileOutputStream.write(b,0,a);
//            }

            Scanner scan = new Scanner(System.in);
            byte b = scan.nextByte();
            fileOutputStream.write(b);
//            char[] chars = s.toCharArray();
//            byte[] c = {95,96,91};
//            FileWriter writer = new FileWriter(new File("F:/dd/aaa.txt"));
            //OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File("F:/dd/aa.txt")));
//            writer.write((char)c[0]);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
