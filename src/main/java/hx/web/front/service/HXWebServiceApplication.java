package hx.web.front.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-18 22:40
 */
@SpringBootApplication
public class HXWebServiceApplication {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        SpringApplication.run(HXWebServiceApplication.class,args);
        System.out.printf("启动耗时 "+(System.currentTimeMillis() - startTime)/1000+" s");
    }
}