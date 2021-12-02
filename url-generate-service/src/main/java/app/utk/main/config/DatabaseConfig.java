package app.utk.main.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @author UtkarshRathore on 02-12-2021
 **/
@Configuration
@PropertySource("classpath:db-config.properties")
public class DatabaseConfig {

    @Autowired
    private Environment env;

    @Bean
    public DataSource getDataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(env.getProperty("DB_DRIVER_CLASS"));
        dataSourceBuilder.url(env.getProperty("DB_URL"));
        dataSourceBuilder.username(env.getProperty("DB_USERNAME"));
        dataSourceBuilder.password(env.getProperty("DB_PASSWORD"));
        return dataSourceBuilder.build();
    }
}
