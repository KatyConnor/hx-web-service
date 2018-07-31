package hx.web.front.service.gateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-18 22:46
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public void index(){
         restTemplate.getForEntity("http://localhost:8082/web/gateway/routing/view.login.vue",String.class).getBody();
//        String  json = restTemplate.postForEntity(targetURL, paramMap, String.class).getBody();
//        System.out.println(json);
//        return json;
//        return "rule/home";
    }
}
