import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

/**
 * Created by linkang on 17-6-21.
 */

public class Demo1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Enumeration<String> initParameterNames = getServletContext().getInitParameterNames();

        while (initParameterNames.hasMoreElements()) {
            String name = initParameterNames.nextElement();
            String value = getServletContext().getInitParameter(name);

            System.out.println("name=" + name + ">>" + value);
        }

        HashMap hashMap = new HashMap();
        hashMap.put("", "");


        System.out.println("hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello2");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello3");
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    @Override
    public void init() throws ServletException {
        System.out.println("hello init");
        super.init();
    }
}
