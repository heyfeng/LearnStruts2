package me.caofeng.convert;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import org.apache.struts2.util.StrutsTypeConverter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.convert
 * @Description: 日期转换器
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 21:16
 * @Version: V1.0
 */
public class DateConvert extends StrutsTypeConverter {
    //支持多种日期格式转换
    private final DateFormat[] dateFormats = {
            new SimpleDateFormat("yyyy年MM月dd日"),
            new SimpleDateFormat("yyyy-MM-dd"),
            new SimpleDateFormat("yyyy/MM/dd"),
            new SimpleDateFormat("yy/MM/dd"),
            new SimpleDateFormat("MM/dd/yy")
            //if you like ,can add  more
    };

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/8 21:19
     * @Description: 将指定格式字符串转为日期类型
    */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) throws TypeConversionException{
        //获取日期的字符串
        String dateStr = values[0];
        System.out.println("时间转换器 " + dateStr);
        int size = dateFormats.length;
        // 遍历预定的日期格式，进行转换
        for (int i = 0 ; i < size ; i ++ ){
            try {
                return dateFormats[i].parse(dateStr);
            } catch (ParseException e) {
                continue;
            }
        }
        //如果转换失败，抛出异常
        throw new TypeConversionException();
    }

    @Override
    public String convertToString(Map context, Object o) {
        Date date = (Date) o;
        String dates =  new SimpleDateFormat("yyyy-MM-dd").format(date);
        return dates;
    }
}
