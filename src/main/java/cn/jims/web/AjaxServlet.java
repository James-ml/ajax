package cn.jims.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Jims on 2017/2/1.
 */
public class AjaxServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String value = req.getParameter("val");
        if (value.equals("momo")){
            resp.getWriter().print("true");
        }else {
            resp.getWriter().print("false");
        }
    }
}
