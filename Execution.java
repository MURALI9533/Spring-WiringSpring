import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Execution {
	public static void main(String args[]) {
		ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("New.xml");
		A a=(A) ctx.getBean("objA");
		B b=a.getB();
		b.m1();
		System.out.println("value of b is     "+"  "+b);
		ctx.close();
	}
}
