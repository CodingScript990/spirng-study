package com.example.demo;

import com.example.demo.yes.very.deep.pack.DeepComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

// [목표]
// - http://localhost:8080/home -> address를 url에 입력했을 때 우리가 만든 html이 보이게 해보기[clear]

//@SpringBootApplication // Bean Object를 찾아서 관리를 해주겠다는 의미
@EnableAutoConfiguration // springBootApplication 이 동작 할 수 있도록 해주는 역할
//@ComponentScan(basePackages = "com.example.demo") // com.example.demo 패키지 안에 있는 경로들을 이용하겠다는 의미임
//@ComponentScan(basePackages = {"com.example.demo.yes", "com.example.demo.controller"}) // 원하는 패키지를 작성하여 사용가능
@ComponentScan(basePackageClasses = DeepComponent.class) // package 만 불러서 이용이 가능함
// ComponentScan : 해당 Component 를 사용해주기 위한 것 => Bean
// IOC : 내가 직접 관리하지 않고, Container 에서 관리를 해준다는 의미
/**
 * @SpringBootConfiguration : Spring Boot 설정 관련 어노테이션
 * @EnableAutoConfiguration : Spring Boot의 필수 어노테이션
 * @ComponentScan : Bean 객체 검색 기준 설정 어노테이션
*/
public class DemoApplication {

	public static void main(String[] args) {
		// 현재 실행중인 IoC Container 를 반환해줌
		// IoC Container 는 Class를 Object로 만들어 내부에 관리함
		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);

		// Container 가 어떤 Bean Object를 가지고 있는지 확인해 본다는 의미
		for (String beanName : applicationContext.getBeanDefinitionNames()) {
			System.out.println(beanName); // result => Bean Object
			// demoApplication, demoController, tempController 현재 사용중인 Bean Object 를 보여줌[관리 중이다는 의미]
		}
	}
}
