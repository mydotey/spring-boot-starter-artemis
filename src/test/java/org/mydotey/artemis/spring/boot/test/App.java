package org.mydotey.artemis.spring.boot.test;

import java.io.IOException;

import org.mydotey.artemis.spring.boot.EnableArtemisServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author koqizhao
 *
 * Sep 21, 2018
 */
@EnableArtemisServer
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class App {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(App.class, args);
    }

}
