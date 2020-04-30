package com.liren.helloworld.exercises;

import java.util.Scanner;

/**
 * Exercises6
 *
 * @author tianruixin
 * @version 1.0
 * @description: 【程序6】题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * @date 2020/4/29 10:39
 */
public class Exercises6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正整数m：");
        int m = scanner.nextInt();
        System.out.println("请输入正整数n：");
        int n = scanner.nextInt();
        Exercises6 exercises6 = new Exercises6();
        int gcd = exercises6.gcd(m, n);
        System.out.println("最大公约数为：" + gcd);
        //最小公倍数=两个数的乘积/两个数的最大公约数
        int i = m * n / gcd;
        System.out.println("最小公倍数为：" + i);
    }

    /**
     * @param m 传入值
     * @param n 传入值
     * @return int
     * @Description: 求最大公约数的方法：辗转相除法（欧几里得算法）两个整数的最大公约数等于其中较小的那个数和两数相除余数的最大公约数
     * @Author tianruixin
     * @Date 2020/4/29 11:19
     **/
    private int gcd(int m, int n) {
        //m与n比较大小，确保m大于n
        if (m < n) {
            int tmp = m;
            m = n;
            n = tmp;
        }
        //n不等于0的时候开始循环辗转相除法gcd(a,b) = gcd(b,a mod b)
        while (n != 0) {
            //若m与n相等，说明最大公约是其本身，返回n
            if (m == n) {
                return n;
            } else {
                //取余数mod
                int mod = m % n;
                //将较小值传给m
                m = n;
                //余数传给n
                n = mod;
            }
        }
        //余数为0时循环结束，返回最大公约数m
        return m;
    }
}