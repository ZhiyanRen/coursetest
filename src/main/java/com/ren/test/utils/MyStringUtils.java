package com.ren.test.utils;

/**
 *  * @program: coursetest
 *  * @Date: 2019/12/14 16:17
 *  * @Author: Mrs.Ren
 *  * @Description: 字符串工具类
 *  
 */
public class MyStringUtils {

    /**
     * 方法一：获取字符串的反转字符串
     * @param originalStr 参数为null，返回空
     * @return
     */
    public static String getReverseStr (String originalStr){
        //这里需要判断参数originalStr是否为空
        //new StringBuilder（str）:str为空报空指针异常（看源码）
        return new StringBuilder(CheckUtils.nullToString(originalStr)).reverse().toString();
    }

    /**
     * 方法二：获取字符串的反转字符串
     * @param originalStr
     * @return
     */
    public static String getStrReverse (String originalStr){
        StringBuilder sb = new StringBuilder();
        //判断字符串是否为空
        for (int i = CheckUtils.nullToString(originalStr).length() - 1; i >= 0; i--) {
            sb.append(originalStr.charAt(i));
        }
        return sb.toString();
    }



}
