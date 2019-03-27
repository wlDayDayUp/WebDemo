package com.springboot.springboot;

import com.springboot.springboot.utils.VCache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)

public class SpringbootApplicationTests {
	@Test
	public void contextLoads() {
	}
	public static void main(String[] args) {
		VCache vcache =new VCache();
		vcache.setInt("a",2,0);
		System.out.println(vcache.getInt("a"));
	}


}
