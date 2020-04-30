package com.liren.helloworld.exercises;

/**
 * Exercises2
 *
 * @author tianruixin
 * @version 1.0
 * @description: 【程序2】题目：判断101-200之间有多少个素数，并输出所有素数。
 * 程序分析：判断素数的方法：用一个数分别去除以2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。
 * @date 2020/4/28 14:12
 */
public class Exercises2 {
    public static void main(String[] args) {
        //总数为count
        int count = 0;
        //定义i是属于101~200之间的数，判断i是否为素数
        for (int i = 101; i <= 200; i++) {
            boolean b = false;
            //定义j是属于2~sqrt(i)之间的数，让i对j取余。若结果为0，则说明i可以除尽某个数，说明i不是素数。
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                } else {
                    b = true;
                }
            }
            //判断b，为true说明上方计算中i为素数，总数count++
            if (b == true) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("素数的个数是：" + count);
    }

}