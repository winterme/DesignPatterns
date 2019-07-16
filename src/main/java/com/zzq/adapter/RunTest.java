package com.zzq.adapter;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 测试
 * @date 2019/7/16 15:04
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class RunTest {
    public static void main(String[] args) {
        /** 类适配 **/
        IUserInfo userInfo = new UserInfo();
        System.out.println( userInfo.getDept() +"<===>" + userInfo.getName() +"<===>" + userInfo.getTel() );

        userInfo = new OutUserToIn();
        System.out.println( userInfo.getDept() +"<===>" + userInfo.getName() +"<===>" + userInfo.getTel() );


        /** 对象适配 **/
        userInfo = new OutUserToInObject(new OutUserToIn());
        System.out.println( userInfo.getDept() +"<===>" + userInfo.getName() +"<===>" + userInfo.getTel() );

    }
}
