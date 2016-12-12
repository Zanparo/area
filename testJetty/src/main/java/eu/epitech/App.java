package eu.epitech;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.File;
import java.io.IOException;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.util.resource.Resource;

public class App extends AbstractHandler
{
    public void handle(String target,
                       Request baseRequest,
                       HttpServletRequest request,
                       HttpServletResponse response)
            throws IOException, ServletException
    {
        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
        baseRequest.setHandled(true);
        response.getWriter().println("<h1>Ceci est un test</h1>");
    }

    public static void main( String[] args )
    {
        Server server = new Server(8080);
        server.setHandler(new App());

        // Add handler to serv static resources
        ResourceHandler resource_handler = new ResourceHandler();
        resource_handler.setDirectoriesListed(true);
        resource_handler.setWelcomeFiles(new String[]{"/html/index.html", "/css/style.css", "/js/index.js"});
        resource_handler.setResourceBase("./src/main/resources/");

        // Add the ResourceHandler to the server.
        HandlerList handlers = new HandlerList();
        handlers.setHandlers(new Handler[] { resource_handler, new DefaultHandler() });
        server.setHandler(handlers);

        ResourceHandler handle = new ResourceHandler();
        // Adding the context for css
        ContextHandler context = new ContextHandler();
        context.setContextPath("/");
        File dir = new File("./ht");
        context.setBaseResource(Resource.newResource(dir));
        context.setHandler(handle);

        ContextHandlerCollection contexts = new ContextHandlerCollection();
        contexts.setHandlers(new Handler[] { context });

        //server.setHandler(contexts);
        try {
            server.start();
            server.join();
        } catch (Exception e)
        {
            System.out.println("Ceci est un test.");
        }
    }
}
