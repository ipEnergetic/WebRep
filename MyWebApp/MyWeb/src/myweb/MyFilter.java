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

import javax.servlet.http.HttpServletResponse;

import javax.xml.ws.WebFault;


public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) {
        System.out.println("MyFilter init!");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;

        System.out.println("inside Filter"); // Тестовая инфа, что зашел в Фильтр

        String idParam = servletRequest.getParameter("id");

        HttpServletResponse resp = (HttpServletResponse)servletResponse;
        if ("softclub".equals(idParam)) {
            resp.sendRedirect("http://softclub.by");
            return;
        }

        filterChain.doFilter(servletRequest, servletResponse);

    }

    @Override
    public void destroy() {
        System.out.println("MyFilter destroy");
    }
}
