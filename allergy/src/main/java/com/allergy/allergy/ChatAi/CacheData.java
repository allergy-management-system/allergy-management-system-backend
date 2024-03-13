package com.allergy.allergy.ChatAi;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import java.util.concurrent.TimeUnit;

public class CacheData {
    private static final Cache<String, Object> cache = Caffeine.newBuilder()
            .expireAfterWrite(10, TimeUnit.MINUTES)
            .maximumSize(100)
            .build();

    public static Object getFromCache(String key) {
        return cache.getIfPresent(key);
    }

    public static void putInCache(String key, Object value) {
        cache.put(key, value);
    }

    public static void removeFromCache(String key) {
        cache.invalidate(key);
    }
}
