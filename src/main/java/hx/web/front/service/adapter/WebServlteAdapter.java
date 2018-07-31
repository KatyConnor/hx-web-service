package hx.web.front.service.adapter;

import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequestInterceptor;
import org.springframework.web.servlet.handler.WebRequestHandlerInterceptorAdapter;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-19 7:47
 */

@Component
public class WebServlteAdapter extends WebRequestHandlerInterceptorAdapter {

    public WebServlteAdapter(WebRequestInterceptor requestInterceptor) {
        super(requestInterceptor);
    }
}
