package com.kang.jdk.data.type;

/**
 * 数据类型
 * @author liuyongkang
 * @date Create in 2023/8/1 20:18
 */
public class TypeDemo01 {

    public static void main(String[] args) {
        // 占一个位,1bit，只有true和false
        boolean flag = true;

        // 一个字符，占8位，1byte = 8bit。可以表示范围 2^7次方，-128 ~ 127
        byte b = 127;

        // 短整型，占两个字符，2byte = 16bit。可表示范围 -32768 ~ 32767
        short s = 32767;

        // 整型，4byte
        int i = 2147483647;

        // 长整型，8byte
        long l = 9223372036854775807L;

        // 浮点型，4byte
        float myFloat = 3.14f;

        // 双精度浮点数，8byte
        double myDouble = 3.14159265358979323;

        // 字符型，2byte
        char c = 'a';

        // 引用类型：类class，接口interface，数组Array
        String str = "中国人";



        System.out.println("\n============进制数================\n");

        // 二进制表示，前面加0b，0b1101=2^3 + 2^2 + 0(不计算) + 2^0 = 13
        int a0 = 0b1101;

        // 八进制表示，数字范围0~7，前面加0，01603=1*8^3 + 6*8^2 + 0(不计算) + 3*8^0 = 899
        int a1 = 01603;

        // 10进制，数字范围0~9
        int a2 = 19;

        // 十六进制，数字范围0~9 & A~F（10~15），0x50CF=5*16^3 + 0(不计算) + 12*16^1 + 15*16^0= 20687
        int a3 = 0x50CF;


        System.out.println("\n==============类型转换==============\n");

        // 基本数据类型向上转换规则，向下只能强制转换
        /*
        1. boolean 不能转换
        2. 不能把对象类型转换为不相干的类型
        3. 基本类型，向下强制类型转换时，要注意内存溢出。
        4. 浮点型转换为整型，精度会丢失
        5. 所有的char本质上都是数字，Unicode编码就是2byte，可表示范围 0~65536
        6. 计算时，先转换为相同的类型，再进行计算
         */

        // 自定转换
        byte a30 = 127;
        int b30 = a30;
        System.out.println(b30);

        // 强制转换后，内存溢出
        byte c30 = (byte)(b30 + 3);
        System.out.println(c30);

        // jdk7开始，支持数字中加入下划线，不影响数字的使用。
        int d30 = 100_000_000;
        System.out.println(d30);
    }

}
