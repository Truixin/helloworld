package com.liren.helloworld.practices;

/**
 * Practice2_9
 *
 * @author tianruixin
 * @version 1.0
 * @description:
 * @date 2020/4/29 16:16
 */
public class Practice2_9 {
    float fvar1=0.1f;
    float fvar2=2.2222f;
    int ivarl=1;


    public void sum_f_I() {
        fvar2 = fvar1 + ivarl;
        System.out.println(fvar2);
    }

    public static void main(String[] args) {
        Practice2_9 p = new Practice2_9();
        p.sum_f_I();
    }
}