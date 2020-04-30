package com.liren.helloworld.practices;

import java.util.Date;

/**
 * Teacher
 *
 * @author tianruixin
 * @version 1.0
 * @description:
 * @date 2020/4/29 16:28
 */
public class Teacher {
    private String name;
    private String sex;
    private Date birthday;
    private int salaryNum;
    private String department;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSalaryNum() {
        return salaryNum;
    }

    public void setSalaryNum(int salaryNum) {
        this.salaryNum = salaryNum;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}