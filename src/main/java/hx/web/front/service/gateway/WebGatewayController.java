package hx.web.front.service.gateway;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-18 23:13
 */
@Controller
@RequestMapping("/gateway")
public class WebGatewayController {

    @RequestMapping(value = "/routing/{path}",method = RequestMethod.GET)
    public String index(@PathVariable("path") String path){
        // 写一个网关然后调用其他系统，返回系统返回结果
        return path.replaceAll("\\.","/");
    }
}
