package com.liren.helloworld.exercises;

import org.apache.logging.log4j.util.Strings;

import java.util.Scanner;

/**
 * Exercises7
 *
 * @author tianruixin
 * @version 1.0
 * @description: 【程序7】题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * @date 2020/4/29 11:33
 */
public class Exercises7 {
    public static void main(String[] args) {
        int abcCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        int chineseCount = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        //获取控制台输入的字符串，回车符为分隔号
        String s = scanner.nextLine();

//        //将从控制台获取的字符串存入char型数组中
//        char[] chars = s.toCharArray();
//        //通过chars[i]将数组中元素取出，通过Character类的方法进行筛选
//        for (int i = 0; i < chars.length; i++) {
//            //使用String.valueOf(chars[i]).matches("[\u4e00-\u9fa5]")可以判断字符是否为汉字；必须是chars[i]的char型字符
//            if (String.valueOf(chars[i]).matches("[\u4e00-\u9fa5]")) {
//                chineseCount++;
//            } else if (Character.isLetter(chars[i])) {
//                abcCount++;
//            } else if (Character.isWhitespace(chars[i])) {
//                spaceCount++;
//            } else if (Character.isDigit(chars[i])) {
//                numCount++;
//            } else {
//                otherCount++;
//            }
//        }

        for (int i = 0; i < s.length(); i++) {
            //String类中有matches方法，可以用正则表达式的方式判断字符串是否有汉字
            //1.使用String.valueOf(s.charAt(i)).matches("[\u4e00-\u9fa5]")判断字符串i位置是否为汉字
            //  s.charAt(i)表示将字符串s的第i位转换成char型，然后用String.valueOf将char型转换为String型
            //2.使用s.substring(i,i+1).matches("[\u4e00-\u9fa5]")也可以判断字符串i位置是否为汉字，s.substring(i,i+1)代表取出s字符串中的一个去比较
            if (s.substring(i, i + 1).matches("[\u4e00-\u9fa5]")) {
                chineseCount++;
            } else if (Character.isLetter(s.charAt(i))) {
                abcCount++;
            } else if (Character.isWhitespace(s.charAt(i))) {
                spaceCount++;
            } else if (Character.isDigit(s.charAt(i))) {
                numCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("汉字的个数：" + chineseCount);
        System.out.println("英文字母个数：" + abcCount);
        System.out.println("空格个数：" + spaceCount);
        System.out.println("数字个数：" + numCount);
        System.out.println("其他字符个数：" + otherCount);
    }
}