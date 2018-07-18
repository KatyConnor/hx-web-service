package hx.web.front.service.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-19 7:40
 */
@WebFilter(servletNames={"dispatcherServlet"})
public class WebServlteFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * 过滤请求
     * @param request
     * @param response
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpResponse = (HttpServletResponse)response;
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");//设置允许哪些域名应用进行ajax访问
        httpResponse.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE");
        httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type");
        filterChain.doFilter(request, response);//调用后续serlvet
    }

    @Override
    public void destroy() {

    }
}
