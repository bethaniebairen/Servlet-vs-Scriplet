package com.problem_4;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContextDemoServlet
 */
@WebServlet("/ContextDemoServlet")
public class ContextDemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig             servletConfig;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContextDemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Output from " + config.getServletName());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        servletConfig = config;
    }
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ServletContext servletContext = servletConfig.getServletContext();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Getting Attributes");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        Enumeration<String> attributes = servletContext.getAttributeNames();
        while (attributes.hasMoreElements())
        {
            String attribute = (String) attributes.nextElement();
            System.out.println("Attribute name : " + attribute);
            System.out.println("Attribute value : " + servletContext.getAttribute(attribute));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Getting Parameters");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        
        Enumeration<String> parameters = servletContext.getInitParameterNames();
        while (parameters.hasMoreElements())
        {
            String parameter = (String) parameters.nextElement();
            System.out.println("Parameter Name:" + parameter);
            System.out.println("The Parameter Value: " + servletContext.getInitParameter(parameter));
        } // end while
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
