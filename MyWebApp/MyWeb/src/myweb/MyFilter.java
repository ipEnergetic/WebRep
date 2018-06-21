package myweb;

import java.io.IOException;

import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("MyFilter init!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        String servletPath = req.getServletPath();
        
        
//        System.out.println("#INFO " + new Date() + " - ServletPath :" + servletPath //
//                + ", URL =" + req.getRequestURL());
        
        // Разрешить request продвигаться дальше. (Перейти данный Filter).
        filterChain.doFilter(servletRequest, servletResponse);
        
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy");
    }
}
