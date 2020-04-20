package com.guahoa.cyqTest;

import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.guahoa.cyqTest.dubbo.api.Demo;

@SpringBootTest
class CyqTestApplicationTests {

    @Reference
    private Demo demo;

	@Test
	void test1() {
	    demo.sayHello("aaaa");
	}

}
