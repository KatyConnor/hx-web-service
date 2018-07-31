package hx.web.front.service.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author mingliang(andyming @ aliyun.com)
 * @date 2018-07-19 7:40
 */
@WebFilter(servletNames={"dispatcherServlet"})
public class WebServlteFilter implements Filter {

    private static final Logger LOGGER = LoggerFactory.getLogger(WebServlteFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.debug("web servlet init");
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
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;

        String requestURI = req.getRequestURI();
        String method = req.getMethod();
        LOGGER.debug("...method...{}",method);
        LOGGER.debug("...MyWebFilter doFilter...");
        LOGGER.debug("req:" + requestURI);

        if (requestURI.startsWith("/web")) {
            RequestDispatcher rd = req.getRequestDispatcher("/web/index/home");
            req.setAttribute("requestURI", requestURI);
            rd.forward(req, resp);
            return;
        }

//        resp.setHeader("Access-Control-Allow-Origin", "*");//设置允许哪些域名应用进行ajax访问
//        resp.setHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE");
//        resp.setHeader("Access-Control-Allow-Headers", "Content-Type");
        filterChain.doFilter(req, resp);//调用后续serlvet
    }

    @Override
    public void destroy() {
        LOGGER.debug("web servlet destroy");
    }
}
