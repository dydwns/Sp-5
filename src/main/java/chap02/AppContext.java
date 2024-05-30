package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext {

	//@Scope("prototype")  
	@Bean
	//빈은 싱글톤을 의미 -별도의 설정이 없으면 스프링에서는 한 객체만을 가져온다.
	//프로토타입
	public Greeter greeter() {

		Greeter g = new Greeter();
		g.setFormat("%s, 안녕하세요!");
		return g;
	}
	}
//