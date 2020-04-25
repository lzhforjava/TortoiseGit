package com.lvzihao.service;

import redis.clients.jedis.Jedis;

import java.util.*;

public class RedisService {
    public void testRes(){
        Jedis jedis = new Jedis("192.144.146.4",6379);
        //设置值
        jedis.set("java1711","毕业很久了");
        //取值
        String java1711 = jedis.get("java1711");
        System.out.println(java1711);
    }

    public static void main(String[] args) {
//        RedisService redisService = new RedisService();
//        redisService.testRes();
        System.out.println(1 << 30);
        System.out.println();
    }
}
