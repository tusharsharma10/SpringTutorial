package Coach.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		BaseballCoach coach = c.getBean("baseballCoach",BaseballCoach.class);
		BaseballCoach alphaCoach = c.getBean("baseballCoach",BaseballCoach.class);
		System.out.println(coach.getDailyFortune());
	}

}
