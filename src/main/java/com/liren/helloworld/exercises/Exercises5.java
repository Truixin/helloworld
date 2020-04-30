package com.liren.helloworld.exercises;

import org.springframework.util.StringUtils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Exercises5
 *
 * @author tianruixin
 * @version 1.0
 * @description: 【程序5】题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * @date 2020/4/28 16:06
 */
public class Exercises5 {
    public static void main(String[] args) {
        String grade;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个成绩：");
        float i = scanner.nextFloat();
//        TOOD 需要一个能判断0~100之间，且小数点保留两位的正则表达式
//        Pattern pattern = Pattern.compile("^(0|[0-9][0-9]?|100)$");
//        Matcher matcher = pattern.matcher("i");
//        boolean matches = matcher.matches();
        while (i > 100 || i < 0) {

            System.out.println("输入成绩不合规范，请重新输入:");

            i = scanner.nextFloat();
        }
        grade = i >= 90 ? "A" : i >= 60 ? "B" : "C";
        System.out.println("等级为：" + grade);
    }
}