package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
@Configuration : 애플리케이션에 대한 Bean 정의의 주석이다. 클래스에 태그를 지정한다.
@EnableAutoConfiguration : Spring Boot에 클래스 경로를 기반으로 Bean 추가를 시작하도록 지시한다.
	설정, 기타 빈 및 다양한 속성 설정.. e.g. 'spring-webmvc'가 클래스 경로에서 애플리케이션을 웹 애플리케이션으로 표시하고
	활성화한다. 'DispatcherServlet' 설정과 같은 주요 동작이다.
@ComponentScan : Spring에게 다른 구성요소, 구성 및 'com/example' 패키지의 서비스를 사용하여 컨트롤러를 찾을 수 있다.

위 세 가지의 기능을 수행하는 것이 @SpringBootApplication이다.
*/

/*
	main() 메서드는 스프링부트의 SpringApplication.run() 메서드를 사용하여 애플리케이션을 시작한다.
	XML이 한 줄도 없고, web.xml 파일도 없다. 이 웹 애플리케이션은 순수한 Java로 배관 또는 인프라 구성을
	처리할 필요가 없다.
*/
@SpringBootApplication
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}

	/*
	 * 실행가능한 JAR 빌드하기
	 ** gradle 프로젝트라면 cmd에 gradlew bootRun 을 실행시킨다. 대안으로 gradlew build가 있다.
	 * 그 다음 java -jar [jar파일 경로(프로젝트 서부터 경로 시작)]
	 ** 
	 * maven 프로젝트라면 cmd에 mvnw spring-boot:run 을 실행시킨다. 대안으로 mvnw clean package가 있다.
	 * 그 다음 java -jar [jar파일 경로(프로젝트 서부터 경로 시작)]
	 * 
	 * 클래식 WAR 파일을 빌드할 수도 있습니다.
	 */
}
