package com.zth;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Date: 2020/6/8 6:00 下午
 *
 * @author 3zZ.
 */
@Slf4j
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    /**
     * Logger logger = LoggerFactory.getLogger(HelloServlet.class);
     * @param req request
     * @param resp response
     * @throws ServletException Servlet异常
     * @throws IOException IO异常
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "z的框架";
        log.debug("name is:" + name);
        req.setAttribute("name",name);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,resp);
    }
}
