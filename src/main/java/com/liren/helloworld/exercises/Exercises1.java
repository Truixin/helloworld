package com.liren.helloworld.exercises;

/**
 * Exercises
 *
 * @author tianruixin
 * @version 1.0
 * @description: 【程序1】题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * @date 2020/4/28 10:28
 */
public class Exercises1 {
    public static void main(String[] args) {
        //这是一个菲波拉契数列问题 f[n]=f[n-1]+f[n-2]
        //f[n]=sumRabbit f[n-1]=rabbit f[n-2]=littleRabbit
        long rabbit = 1;
        long sumRabbit = 1;
        long littleRabbit = 0;
        long month = 100;
        int i = 0;
        for (i = 1; i < 3; i++) {
            System.out.println("第" + i + "个月的兔子对数: " + sumRabbit);
        }
        for (i = 3; i < month; i++) {
            littleRabbit = sumRabbit;
            sumRabbit = rabbit + littleRabbit;
            rabbit = littleRabbit;
            System.out.println("第" + i + "个月的兔子对数: " + sumRabbit);
        }
    }
}
