package com.generation.reactspringrestsecurity.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ComponentScan({ "com.generation.reactspringrestsecurity.task"})
public class SpringTaskConfig {
}
