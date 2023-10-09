package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/*
https://spring.io/guides/gs/rest-service/
https://github.com/spring-guides/gs-rest-service#test-the-service
기존 MVC 컨트롤러와 RESTful 웹 서비스의 주요한 차이점은 HTTP 응답 본문이 생성되는 방식이다.
greeting 데이터를 HTML로 서버측으로 렌더링하기 위해 뷰 기술을 사용하는 대신 Greeting 개체를 채우고 반환한다.
객체 데이터는 JSON으로 HTTP 응답에 직접 기록된다.
*/

@RestController // @Controller와 @ResponseBody를 포함한다.
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    /*
     * Greeting 객체는 JSON으로 변환되어야 한다. Spring의 HTTP 메시지 변환기 지원 덕분에 이러한 변환 과정을 수동으로 진행할
     * 필요가 없다.
     * Jackson 2가 클래스 경로에 있기 때문에 Spring의 MappingJackson2HttpMessageConverter는
     * Greeting 인스턴스를 JSON으로 변환하기 위해
     * 자동으로 선택된다.
     */
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    /*
     * @RequestParam은 쿼리 문자열 매개변수 name 값을 Greeting() 메서드의 name 매개변수에 바인딩한다.
     * 요청에 name 매개변수가 없는 경우, defaultValue 값인 World를 사용한다.
     * 메서드 본문의 구현은 counter의 다음 값을 기반으로 id 및 content 속성이 있는 새 Greeting 객체를
     * 생성 및 반환하고 greeting 템플릿을 사용하여 지정된 이름의 형식을 지정한다.
     */

    /*
     * Gradle 또는 Maven을 사용하여 명령줄에서 애플리케이션을 실행할 수 있습니다.
     * 필요한 모든 종속성, 클래스 및 리소스가 포함된 단일 실행 가능 JAR 파일을 빌드하고 실행할 수도 있습니다.
     * 실행 가능한 jar을 구축하면 개발 수명 주기 전반에 걸쳐 다양한 환경 등에서 서비스를
     * 애플리케이션으로 쉽게 제공, 버전 지정 및 배포할 수 있습니다.
     */
}
