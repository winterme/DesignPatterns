package com.zzq.strategy;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 测试
 * @date 2019/7/16 10:26
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class RunTest {
    public static void main(String[] args) {
        // 实例化策略
        Strategy add = new AddStrategy();
        // 创建上下文环境
        Context context = new Context(add);

        System.out.println( context.option(1,2 ) );

        context = new Context(new SubStrategy());
        System.out.println( context.option(1,2 ) );

    }
}
