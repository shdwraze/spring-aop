package com.musicplayer.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.musicplayer")
@EnableAspectJAutoProxy
public class AppConfig {

}
