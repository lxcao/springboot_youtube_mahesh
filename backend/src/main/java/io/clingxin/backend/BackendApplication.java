/*
 * @Author: clingxin
 * @Date: 2021-04-01 12:34:02
 * @LastEditTime: 2021-04-01 14:05:23
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /springboot_youtube_mahesh/backend/src/main/java/io/clingxin/backend/BackendApplication.java
 */
package io.clingxin.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

}
