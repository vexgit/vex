package org.vex.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:/vex.properties")
public class VexMainConfig {

    private Logger logger = LoggerFactory.getLogger(VexMainConfig.class);

    @Bean
    public String testProperties(Environment environment) {
        logger.info("testProperties. key1={}", environment.getProperty("key1"));
        return "";
    }


}
