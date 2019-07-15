package com.zzq.decoration;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 咖啡类的装饰类
 * @date 2019/7/15 16:48
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class CofferDecoration extends Coffer {

    private Coffer proxy;

    public CofferDecoration(Coffer coffer){
        this.proxy = coffer;
    }


    @Override
    public String getName() {
        return this.proxy.getName();
    }

    @Override
    public String getPrice() {
        return this.proxy.getPrice();
    }
}
