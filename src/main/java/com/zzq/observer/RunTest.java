package com.zzq.observer;

import java.util.Date;

public class RunTest {
    public static void main(String[] args) {
        Beauty li = new LiBeauty("小丽");

        LittleBoy boy1 = new LittleBoyAnyone("小李");
        LittleBoy boy2 = new LittleBoyAnyone("小豪");

        li.addLittleBoy(boy1);
        li.addLittleBoy(boy2);

        li.noticeAnyone("今天天气真好..."+new Date());

        li.delLittleBoy(boy2);
        li.addLittleBoy( new LittleBoyAnyone("小张") );
        li.addLittleBoy( new LittleBoyAnyone("小张2") );
        li.addLittleBoy( new LittleBoyAnyone("小张3") );

        li.noticeAnyone("看电影有人吗..."+new Date());

    }
}
