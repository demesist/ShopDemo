//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpRequest;
//import javax.servlet.http.HttpResponse;
import javax.servlet.http.*;
import java.io.PrintWriter;
import java.io.IOException;

public class HelloWorld extends HttpServlet{
	
	public void doGet(HttpServletRequest request,
	HttpServletResponse response) throws IOException  {
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String nombre = request.getParameter("nombre");
	String precio = request.getParameter("precio");
	String categoria = request.getParameter("categoria");
	String moneda = request.getParameter("moneda");
	String existencia = request.getParameter("existencia");
	out.println("<h1>hello</>");
	out.println("nombre" + nombre);
	out.println("precio" + precio);
	out.println("categoria" + categoria);
	out.println("moneda" + moneda);
	out.println("existencia" + existencia);
	
	}


}