package com.zzq.strategy;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: sub ， 减，减操作的时候调用这个类
 * @date 2019/7/16 10:23
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class SubStrategy implements Strategy {
    @Override
    public double option(double a, double b) {
        return a - b;
    }
}
