package eu.epitech;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Mimoone on 09/12/2016.
 */
public class AppServlet extends HttpServlet
{
    private String _greeting="Hello World";

    public AppServlet(String greeting)
    {
        _greeting = greeting;
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Request : " + request.toString());
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().println("<h1>" + _greeting + "</h1>");
        response.getWriter().println("session=" + request.getSession(true).getId());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println("Ceci est un post");
    }
}
