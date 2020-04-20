package com.guahoa.cyqTest.dubbo.provider;

import org.apache.dubbo.config.annotation.Service;

import com.guahoa.cyqTest.dubbo.api.Demo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: ouyoung
 * @date: 2020/4/20
 */
@Service
@Slf4j
public class ProviderExample implements Demo
{

    @Override
    public void sayHello(String str)
    {
        log.info("调用方say Hello: {}", str);
    }
}
