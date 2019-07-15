package com.zzq.observer;

import java.util.Date;

public class LittleBoyAnyone extends LittleBoy {

    private String name;

    public LittleBoyAnyone(String name){
        this.name = name;
    }

    public void receivedMsg(String msg) {
        System.out.println( this.name +"==========>女神牛皮..." +"=============>"+new Date());
    }
}
