package cn.ifengkou.boot;

import cn.ifengkou.spi.Pusher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class InvokerSpringbootApplication implements CommandLineRunner {
	@Autowired
	Pusher pusher;

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext context = SpringApplication.run(InvokerSpringbootApplication.class, args);
		System.out.println("执行完毕");
	}

	@Override
	public void run(String... strings) throws Exception {
		if(pusher != null){
			int numbs = pusher.push(new String[]{"1890000000"},"你好 Spring Factories");
			System.out.println("调用端获取的结果："+String.valueOf(numbs));
		}
	}
}
