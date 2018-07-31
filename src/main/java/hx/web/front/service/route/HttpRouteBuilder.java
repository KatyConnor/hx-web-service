//package hx.web.front.service.route;
//
//import hx.web.front.service.adapter.HttpRequestProcessor;
//import org.apache.camel.spring.SpringRouteBuilder;
//import org.springframework.stereotype.Component;
//
///**
// * @author mingliang(andyming @ aliyun.com)
// * @date 2018-07-19 21:49
// */
//@Component
//public class HttpRouteBuilder extends SpringRouteBuilder {
//
//    @Override
//    public void configure() throws Exception {
//        from("jetty:http://localhost:8080/myapp/myservice").process(new HttpRequestProcessor());
//    }
//}
