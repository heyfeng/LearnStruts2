import me.caofeng.util.DbHelper;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

/**
 * Copyright © 2017曹峰. All rights reserved.
 *
 * @Prject: struts2
 * @Package: PACKAGE_NAME
 * @Description:
 * @Author: 曹峰 blog.caofeng.me
 * @Date: 2017-05-11 1:53
 * @Version: V1.0
 */
public class TestDbHelper {
    private Logger LOGGER ;
    private DbHelper dbHelper ;
    @Before
    public void inti(){
        LOGGER = Logger.getLogger(TestDbHelper.class);
        dbHelper = DbHelper.getInstance();
    }
    @Test
    public void testConnection() throws SQLException {
        LOGGER.debug(dbHelper.getConnection());
    }
}
