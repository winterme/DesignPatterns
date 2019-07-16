package com.zzq.adapter;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 本系统UserInfo
 * @date 2019/7/16 14:57
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class UserInfo implements IUserInfo {
    @Override
    public String getName() {
        return "获取到了用户姓名...";
    }

    @Override
    public String getTel() {
        return "获取到了用户电话号码...";
    }

    @Override
    public String getDept() {
        return "获取到了用户单位...";
    }
}
