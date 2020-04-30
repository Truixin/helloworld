package com.liren.helloworld.exercises;

/**
 * Exercises3
 *
 * @author tianruixin
 * @version 1.0
 * @description: 【程序3】题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 * @date 2020/4/28 15:08
 */
public class Exercises3 {
    public static void main(String[] args) {
        //百位
        int b1;
        //十位
        int b2;
        //个位
        int b3;
        for (int i = 100; i <= 1000; i++) {
            b1 = i / 100 % 10;
            b2 = i / 10 % 10;
            b3 = i % 10;
            if (Math.pow(b1, 3) + Math.pow(b2, 3) + Math.pow(b3, 3) == i) {
                System.out.println("水仙花数为：" + i);
            }
        }
    }
}