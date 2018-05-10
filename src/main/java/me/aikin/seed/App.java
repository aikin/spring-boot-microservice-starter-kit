package me.aikin.seed;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@Slf4j
public class App {
    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

        log.info("max memory:{} MB", Runtime.getRuntime().maxMemory() / 1024 / 1024);
        log.info("total memory:{} MB", Runtime.getRuntime().totalMemory() / 1024 / 1024);
        log.info("free memory:{} MB", Runtime.getRuntime().freeMemory() / 1024 / 1024);
        log.info("used memory:{} MB", (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 / 1024);
        log.info("available processors:{}", Runtime.getRuntime().availableProcessors());
    }
}
