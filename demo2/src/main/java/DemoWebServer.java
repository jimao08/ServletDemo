import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.ServerConnector;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerCollection;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.webapp.WebAppContext;

public class DemoWebServer {
    public static void main(String[] args) throws Exception {
        Server server = new Server();
        ServerConnector connector = new ServerConnector(server);
        connector.setPort(8080);
        server.setConnectors(new Connector[]{connector});
//        ServletContextHandler context = new ServletContextHandler();
//        context.setContextPath("/");
//        context.addServlet(Demo1.class, "/hello");
        WebAppContext webapp = new WebAppContext("/home/linkang/tools/workspace/ServletDemo/demo2/web","/a");
        HandlerCollection handlers = new HandlerCollection();
        handlers.setHandlers(new Handler[]{webapp, new DefaultHandler()});

        server.setHandler(handlers);
        server.start();
        server.join();
    }
}