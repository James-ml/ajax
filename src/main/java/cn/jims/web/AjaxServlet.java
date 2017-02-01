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
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String value = req.getParameter("val");
        if (value.equals("momo")){
            //传单个值，字符串和直接传值都可以，ajax会解析成json
//            resp.getWriter().print("true");
//            resp.getWriter().print(true);

            //传对象(\:转义")
            String str = "{\"name\":\"正确\",\"content\":\"勾\"}";
            resp.getWriter().print(str);
        }else {
            //resp.getWriter().print("false");
            String str = "{\"name\":\"错误\",\"content\":\"叉\"}";
            resp.getWriter().print(str);
        }
    }
}
