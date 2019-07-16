package com.zzq.strategy;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description:  上下午环境，用于屏蔽客户端与策略类的耦合
 * @date 2019/7/16 10:24
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public double option(double a , double b){
        return this.strategy.option(a, b);
    }

}
