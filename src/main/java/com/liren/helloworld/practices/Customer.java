package com.liren.helloworld.practices;

/**
 * Customer
 *
 * @author tianruixin
 * @version 1.0
 * @description:
 * @date 2020/4/29 15:10
 */
public class Customer {
    String name;
    String adress;
    String telephone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public static void main(String[] args) {
        Customer customer1 = new Customer();
        Customer customer2 = new Customer();

        customer1.setName("zhangfeng");
        customer1.setAdress("# 130 Nan Road");
        customer1.setTelephone("123456");

        customer2.setName("jinwei");
        customer2.setAdress("# 130 Bei Road");
        customer2.setTelephone("654123");

        System.out.println("");
    }
}