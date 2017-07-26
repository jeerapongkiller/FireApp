package com.example.fire.fireapp;

/**
 * Created by monze on 7/23/2017.
 */
public class Blog {

    private String id, name, que;

    public Blog(){

    }

    public Blog(String id, String name, String que) {
        this.id = id;
        this.name = name;
        this.que = que;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }
}
