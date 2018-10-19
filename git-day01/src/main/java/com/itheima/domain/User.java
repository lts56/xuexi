package com.itheima.domain;

/**
 * @Author: lts
 * @Date: 2018/10/19 20:44
 */
public class User {

    private String name;//年龄16
    private int math;//数学成绩 很厉害

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", math=" + math +
                '}';
    }
}
