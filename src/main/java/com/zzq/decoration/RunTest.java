package com.zzq.decoration;

/**
 * @author maxwell
 * @Title: zhangzq
 * @ProjectName Design Patterns
 * @Description: 控制台测试
 * @date 2019/7/15 16:59
 * @email: bestzijia@gmail.com
 * @github: https://github.com/winterme/
 * @csdn: https://blog.csdn.net/yali_aini
 */
public class RunTest {
    public static void main(String[] args) {
        // 蓝山咖啡，对蓝山咖啡进行加料
        Coffer coffer = new BlueCoffer();
        System.out.println( coffer.getName() + "<========>" +coffer.getPrice() );

        coffer = new MilkCofferDecoration(coffer);
        System.out.println( coffer.getName() + "<========>" +coffer.getPrice() );

        coffer = new CoconutCofferDecoration(coffer);
        System.out.println( coffer.getName() + "<========>" +coffer.getPrice() );

        coffer = new CoconutCofferDecoration(coffer);
        System.out.println( coffer.getName() + "<========>" +coffer.getPrice() );

        coffer = new CoconutCofferDecoration(coffer);
        System.out.println( coffer.getName() + "<========>" +coffer.getPrice() );
    }

}
