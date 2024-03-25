package sun.com.springbootapp.config;/*
@author sun
@date 24/03/21
@project IntelliJ IDEA
*/

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class redisTest {
    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testRedis(){
        System.out.println(redisTemplate);
    }
}
