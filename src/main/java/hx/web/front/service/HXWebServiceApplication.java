package hx.web.front.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-18 22:40
 */
@SpringBootApplication
@ServletComponentScan//开启WebFilter、WebServlet、WebListener配置支持
public class HXWebServiceApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SpringApplication.run(HXWebServiceApplication.class,args);
//        final ApplicationContext context = new SpringApplication(Application.class).run(args);
//        final CamelSpringBootApplicationController controller = context.getBean(CamelSpringBootApplicationController.class);
//        controller.run();
        System.out.printf("启动耗时 "+(System.currentTimeMillis() - startTime)/1000+" s");
    }
}
