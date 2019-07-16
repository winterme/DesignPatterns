package com.zzq.adapter;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 外部系统用户转化为本系统用户（这就是一个 adapter）=> 类适配器模式
 * @date 2019/7/16 15:03
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class OutUserToIn extends OutUserInfo implements IUserInfo {
    @Override
    public String getName() {
        return super.getBaseInfo().get("name");
    }

    @Override
    public String getTel() {
        return super.getBaseInfo().get("tel");
    }

    @Override
    public String getDept() {
        return super.getWorkInfo().get("dept");
    }
}
