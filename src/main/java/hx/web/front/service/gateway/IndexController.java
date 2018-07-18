package hx.web.front.service.gateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-18 22:46
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String index(){
        return "rule/home";
    }
}
