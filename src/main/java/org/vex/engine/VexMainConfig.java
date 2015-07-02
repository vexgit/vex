package org.vex.engine;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.vex.components.ThreadManager;

@Configuration
@PropertySource("classpath:/vex.properties")
public class VexMainConfig {

    @Bean
    public String testProperties(Environment environment) {
        System.out.println(environment.getProperty("key1"));
        return "";
    }

    @Bean
    public Thread keepAlive(ThreadManager threadManager) {
        Thread keepAlive = new Thread(() -> {
            threadManager.sleep(Long.MAX_VALUE);
        });
        keepAlive.setName("keepAlive");
        keepAlive.start();
        return keepAlive;
    }

}
