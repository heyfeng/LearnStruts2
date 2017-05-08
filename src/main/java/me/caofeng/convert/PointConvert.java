package me.caofeng.convert;

import me.caofeng.beans.Point;
import org.apache.struts2.StrutsConstants;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.convert
 * @Description: 坐标转换器
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 21:07
 * @Version: V1.0
 */
public class PointConvert extends StrutsTypeConverter{

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/8 21:10
     * @Description: 键字符串转换为Point类
    */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        String str = values[0];
        String xy[] = str.split(",");
        double x = Double.parseDouble(xy[0]);
        double y = Double.parseDouble(xy[1]);
        System.out.println("坐标转换器 x " + x + " y " + y);
        Point point = new Point();
        point.setX(x);
        point.setY(y);
        return point;
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/8 21:13
     * @Description: 将坐标转换为字符串
    */
    @Override
    public String convertToString(Map context, Object o) {
        Point point = (Point) o;
        double x = point.getX();
        double y = point.getY();
        String str = "("+x+","+y+")";
        System.out.println("坐标转换结果 "+ str);
        return str;
    }
}
