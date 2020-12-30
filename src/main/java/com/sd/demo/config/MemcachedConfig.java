package com.sd.demo.config;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.XMemcachedClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class MemcachedConfig {

    @Value("${app.memcached.host}")
    private String host;

    @Bean
    public MemcachedClient memcachedClient() throws IOException {
        return new XMemcachedClient(host, 11211);
    }
}
