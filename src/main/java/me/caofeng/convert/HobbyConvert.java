package me.caofeng.convert;

import me.caofeng.beans.Hobby;
import org.apache.struts2.util.StrutsTypeConverter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: me.caofeng.convert
 * @Description: 兴趣爱好转换器
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-08 21:30
 * @Version: V1.0
 */
public class HobbyConvert extends StrutsTypeConverter {

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/8 21:33
     * @Description: 将兴趣字符串转为兴趣
    */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        List list = new ArrayList();
        int size = values.length;
        for (int i = 0 ; i < size ; i++ ){
            Hobby hobby = new Hobby();
            String str = values[i];
            hobby.setHobby(str);
            list.add(hobby);
        }
        return list;
    }

    /**
     * @Author:曹峰 blog.caofeng.me
     * @Date: 2017/5/8 21:33
     * @Description: 将兴趣爱好转为字符串
    */
    @Override
    public String convertToString(Map context, Object o) {
        List list = (List) o;
        StringBuffer buffer = new StringBuffer();
        int size = list.size();
        for (int i = 0 ; i < size ; i++ ){
            Hobby hobby = (Hobby) list.get(i);
            buffer.append(hobby.getHobby() + " ");
        }
        return buffer.toString();
    }
}
