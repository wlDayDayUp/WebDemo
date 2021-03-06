package com.yk.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
@EnableDubbo
@MapperScan("mapper")
public class ProviderApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(ProviderApplication.class, args);
		System.out.println("服务端启动成功！！！");
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
