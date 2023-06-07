package com.bjpowernode;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        Jedis jd = new Jedis("192.168.37.130",6379);
        String result = jd.ping();
        System.out.println("result "+result); //PONG

        //发送命令
        jd.set("deptNo","1000"); //set deptNo  1000
        String value = jd.get("key1");
        System.out.println("value = "+value);
    }
}
