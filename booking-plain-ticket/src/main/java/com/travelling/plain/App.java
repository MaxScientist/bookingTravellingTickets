package com.travelling.plain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@RefreshScope
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,args);
    }
}
