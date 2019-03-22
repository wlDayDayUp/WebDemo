package com.lj.common.domin;

import java.io.Serializable;
import java.util.PrimitiveIterator;

/**
 * Created with IntelliJ IDEA.
 * User: gaopeng
 * Date: 2018/8/28 0028
 * Time: 18:00
 * Description:
 */
public class User implements Serializable{
    private int id;

    private  String name;

    private  int age;

    private String sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
