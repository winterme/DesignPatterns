package com.zzq.decoration;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 咖啡加椰子
 * @date 2019/7/15 16:56
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class CoconutCofferDecoration extends CofferDecoration {

    public CoconutCofferDecoration(Coffer coffer) {
        super(coffer);
    }

    @Override
    public String getName() {
        return "加椰子=>" + super.getName() ;
    }

    @Override
    public String getPrice() {
        return "加椰子加2块=>"+super.getPrice();
    }
}
