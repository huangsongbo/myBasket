package com.hsaber;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MybasketApplication {

	/**
	 * 启动项目打开h2数据库
	 * @return
	 */
	@Bean
	Server h2Server() {
		Server server = new Server();
		try {
			server.runTool("-tcp");
			server.runTool("-tcpAllowOthers");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return server;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MybasketApplication.class, args);
	}
	
}
