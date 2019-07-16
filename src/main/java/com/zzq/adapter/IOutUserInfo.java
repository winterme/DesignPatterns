package com.zzq.adapter;

import java.util.Map;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 外部用户对象接口（返回map的）
 * @date 2019/7/16 14:59
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public interface IOutUserInfo {

    Map<String,String> getBaseInfo();

    Map<String,String> getWorkInfo();

}
