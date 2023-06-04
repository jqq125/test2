package com.kiki;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class Springboot04DataApplicationTests {
    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() throws SQLException {
        //查看一下数据源，返回：class com.alibaba.druid.pool.DruidDataSource
        System.out.println(dataSource.getClass());

        //获得数据库连接(失败，问题：mysql服务无法启动）
        Connection connection=dataSource.getConnection();
        //返回：com.alibaba.druid.proxy.jdbc.ConnectionProxyImpl@70721c12
        System.out.println(connection);
        // xxxxTemplate：SpringBoot已经配置好的模板，拿来即用
        //jdbc
        //redis

        //关闭数据库连接
        connection.close();
    }
}