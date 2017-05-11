import org.apache.log4j.Logger;
import org.junit.Test;

import java.lang.annotation.Target;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: PACKAGE_NAME
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 1:50
 * @Version: V1.0
 */
public class TestLog4j {
    @Test
    public void logger(){
        Logger logger = Logger.getLogger(TestLog4j.class);
        logger.debug("test logger ");
    }
}
