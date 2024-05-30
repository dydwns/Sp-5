package chap02;

import java.lang.annotation.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx =//싱글톤객체 
				new AnnotationConfigApplicationContext(AppContext.class);
		Greeter g1 = ctx.getBean("greeter",Greeter.class);  //true인것은 g1과g2가 같은 객체, 외부에서 생성
		Greeter g2 = ctx.getBean("greeter",Greeter.class); //getbean메서드는 같은 객체를 리턴한다.
		System.out.println("(g1==g2)="+(g1==g2));
		ctx.close();
	
	}

}
