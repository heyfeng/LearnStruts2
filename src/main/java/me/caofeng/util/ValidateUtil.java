package me.caofeng.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.util
 * @Description: 简单的字符串验证工具类
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-09 0:45
 * @Version: V1.0
 */
public class ValidateUtil {
    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/9 0:45
     * @Description:  检查字符串是否为空
     * @return true 字符串为空，false字符串不为空
    */
   public static boolean isEmpty(String str){
      if (null == str || str.length() == 0  || str.trim().equals("")){
          return true;
      }
      return false;
   }

    /**
     * 检验字符串是否全部为数字
     * @param str
     * @return true 全部为数字，false包含其他字符
     */
    public static boolean isDigit(String str ){
        if (isEmpty(str)){
            return true;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    /**
     * 检测字符串是否包含中文
     * @param str
     * @return true 包含中文，false 不包含中文
     */
    public static boolean isContainChinese(String str){
        if (isEmpty(str)){
            return false;
        }
        String regs = "[\u4e00-\u9fa5]";
        Pattern pattern = Pattern.compile(regs);
        Matcher matcher = pattern.matcher(str);
        return  matcher.find();
    }
}
