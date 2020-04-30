package com.liren.helloworld.practices;

/**
 * _2_15
 *
 * @author tianruixin
 * @version 1.0
 * @description:
 * @date 2020/4/29 15:30
 */
public class _2_15 {
    public static void main(String[] args) {
        int x = 7;
        int y = x;
        System.out.println(x);
        System.out.println(y);
        x = 5;
        System.out.println(x);
        System.out.println(y);

        String s = "Hello";
        String t = s;
       // s = "World";
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(t);
        System.out.println(t.hashCode());
      //  s = "World";
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(t);
        System.out.println(t.hashCode());

        System.out.println(s==t);
        System.out.println(s.equals(t));
    }
}