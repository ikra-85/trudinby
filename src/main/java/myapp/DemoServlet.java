package myapp;

import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
    resp.getWriter()
        .println(
            "<!DOCTYPE html>\n"
                + "\n"
                + "<html>\n"
                + "<head>\n"
                + "\t<title>iStudent</title>\n"
                + "</head>\n"
                + "\n"
                + "<body>\n"
                + "<h1>iStudent</h1>\n"
                + "\n"
                + "<h2>Войти на сайт</h2>\n"
                + "\n"
                + "<h4><a href=\"ref.here\">Студент</a></h4>\n"
                + "<h4><a href=\"ref.here\">Работодатель</a></h4>\n"
                + "\n"
                + "Хакатон 2009 Могилёв\n"
                + "\n"
                + "</body>\n"
                + "</html>");
    }
}
