package com.liren.helloworld.practices;

/**
 * _3_2
 *
 * @author tianruixin
 * @version 1.0
 * @description:
 * @date 2020/4/29 16:50
 */
public class _3_2 {
//    public static void main(String[] args) {
//        int x = (int) (Math.random() * 100);
//        int y = 0;
//        int z;
//        if (x > 50) {
//            y = 9;
//        }
//        z = x + y;
//        System.out.println(x);
//        System.out.println(z);
//    }

    public static void main(String[] args) {
        _3_2 c = new _3_2();
        String name = "John Smith";
        {
            name = "Tom David";
            c.name = name;
            System.out.println(c.name);

        }
        // String name = "John Smith";
    }

    private String name;
    int a = 1001;
    int b = 1002;

}