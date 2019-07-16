package com.zzq.adapter;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 外部对象转化为内部对象，==> 对象适配
 * @date 2019/7/16 15:10
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class OutUserToInObject implements IUserInfo {

    private IOutUserInfo outUserInfo;

    public OutUserToInObject(IOutUserInfo outUserInfo) {
        this.outUserInfo = outUserInfo;
    }

    @Override
    public String getName() {
        return this.outUserInfo.getBaseInfo().get("name");
    }

    @Override
    public String getTel() {
        return this.outUserInfo.getBaseInfo().get("tel");
    }

    @Override
    public String getDept() {
        return this.outUserInfo.getWorkInfo().get("dept");
    }
}
