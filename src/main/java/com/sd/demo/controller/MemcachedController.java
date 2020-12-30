package com.sd.demo.controller;

import com.sd.demo.domain.Item;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("memcached")
public class MemcachedController {

    private final MemcachedClient memcachedClient;

    public MemcachedController(MemcachedClient memcachedClient) {
        this.memcachedClient = memcachedClient;
    }

    @PostMapping
    public void setKey(@RequestBody Item item) throws InterruptedException, MemcachedException, TimeoutException {
        memcachedClient.set(item.getKey(), 3600, item.getValue());
    }

    @GetMapping("{key}")
    public String getKey(@PathVariable String key) throws InterruptedException, MemcachedException, TimeoutException {
        return memcachedClient.get(key);
    }
}
