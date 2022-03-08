package ma.octo.aop.config;

import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(value = "ma.octo",
    excludeFilters = @Filter(type = FilterType.REGEX, pattern = "ma.octo.aop.entity.*"))
@PropertySource("classpath:application.properties")
@Import({DevConfigProperties.class, ProdConfigProperties.class})
public class AppConfig {

}
