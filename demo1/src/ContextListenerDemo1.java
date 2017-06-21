import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Created by linkang on 17-6-21.
 */
public class ContextListenerDemo1 implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destroy");
    }
}
