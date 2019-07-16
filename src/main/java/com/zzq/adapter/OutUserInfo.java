package com.zzq.adapter;

import java.util.HashMap;
import java.util.Map;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 外部用户信息
 * @date 2019/7/16 15:00
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class OutUserInfo implements IOutUserInfo {
    @Override
    public Map<String, String> getBaseInfo() {
        Map<String,String> data = new HashMap<>();
        data.put("name", "外部系统用户姓名...");
        data.put("tel", "外部系统用户电话号码...");

        return data;
    }

    @Override
    public Map<String, String> getWorkInfo() {
        Map<String,String> data = new HashMap<>();
        data.put("dept", "外部系统用户工作单位...");

        return data;
    }
}
