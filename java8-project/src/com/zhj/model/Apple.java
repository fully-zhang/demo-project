package com.zhj.model;

/**
 * Created by Administrator on 2017/8/29.
 */
public class Apple {

    private Integer id;

    private String color;

    private Integer weight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Apple() {
    }

    public Apple(Integer id, String color, Integer weight) {
        this.id = id;
        this.color = color;
        this.weight = weight;
    }
}
