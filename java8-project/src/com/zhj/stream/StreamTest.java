package com.zhj.stream;

import com.zhj.model.Apple;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/8/29.
 */
public class StreamTest {

    final static List<Apple> appleList = new ArrayList(){{

        for (int i = 0; i < 10; i++) {
             add(new Apple(i+1,"red"+i,120+i*10));
        }
        /*
        add(new Apple(1,"red",120));
        add(new Apple(2,"green",300));
        add(new Apple(3,"blue",130));
        add(new Apple(4,"yellow",200));
        add(new Apple(5,"write",155));
        add(new Apple(6,"black",100));*/
    }};

    public static void main(String[] args) {
        System.out.println("appleList:");
        for (Apple apple : appleList) {
            System.out.println("id="+apple.getId()+"---color="+apple.getColor()+"---weight="+apple.getWeight());
        }

        //顺序处理
        List<Apple> apples = getAscAppleList();
        System.out.println("apples:");
        for (Apple apple : apples) {
            System.out.println("id="+apple.getId()+"---color="+apple.getColor()+"---weight="+apple.getWeight());
        }

        //并行处理
        List<Apple> syncAppleList = getSyncAppleList();
        System.out.println("syncAppleList");
        for (Apple apple : syncAppleList) {
            System.out.println("id="+apple.getId()+"---color="+apple.getColor()+"---weight="+apple.getWeight());
        }

    }

    public static List<Apple> getAscAppleList() {
        return appleList.stream().filter((Apple apple)->
                apple.getWeight() > 150).collect(Collectors.toList());
    }

    public static List<Apple> getSyncAppleList() {
        return appleList.parallelStream().filter((Apple apple)->
                apple.getWeight() > 150).collect(Collectors.toList());
    }

}
