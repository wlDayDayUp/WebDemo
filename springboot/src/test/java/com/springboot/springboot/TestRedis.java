package com.springboot.springboot;
import javax.annotation.Resource;

import com.springboot.springboot.utils.VCache;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
@SpringBootTest(classes = SpringbootApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestRedis {
    @Resource
    private RedisTemplate<String, String> redisTemplate;
    @Test
    public void testSet() throws JSONException {
        System.out.println(this.redisTemplate.opsForValue().get("study"));
    }
}
