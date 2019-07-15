package com.zzq.decoration;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 蓝山咖啡
 * @date 2019/7/15 17:01
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class BlueCoffer extends Coffer {
    @Override
    public String getName() {
        return "蓝山咖啡";
    }

    @Override
    public String getPrice() {
        return "成本价=>20块";
    }
}
