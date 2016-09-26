package com.lhz.test.retrofitsample.bean;

/**
 * Created by liuhanzhi on 16/9/22.
 */
public class Repo {
    String id;
    String name;
    String full_name;

    @Override
    public String toString() {
        return "id:" + id + ",name:" + name + ",full_name:" + full_name;
    }
}
