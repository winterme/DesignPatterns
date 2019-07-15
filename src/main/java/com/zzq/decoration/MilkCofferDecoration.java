package com.zzq.decoration;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 咖啡加牛奶
 * @date 2019/7/15 16:52
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class MilkCofferDecoration extends CofferDecoration {
    public MilkCofferDecoration(Coffer coffer) {
        super(coffer);
    }

    @Override
    public String getName() {
        return "牛奶=>" + super.getName();
    }

    @Override
    public String getPrice() {
        return "牛奶+1块=>" + super.getPrice() ;
    }
}
