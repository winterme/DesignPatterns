package com.zzq.observer;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class LiBeauty extends Beauty {

    private String name;

    private Set<LittleBoy> boys;

    public LiBeauty(String name){
        this.name = name;
        this.boys = new HashSet<>();
    }

    @Override
    void addLittleBoy(LittleBoy boy) {
        this.boys.add(boy);
    }

    @Override
    void delLittleBoy(LittleBoy boy) {
        this.boys.remove(boy);
    }

    @Override
    void noticeAnyone(String msg) {
        System.err.println(this.name + "====>" + msg +"===========>"+ new Date());
        for (LittleBoy boy : this.boys) {
            boy.receivedMsg(msg);
        }
    }
}
