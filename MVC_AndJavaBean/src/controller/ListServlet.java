package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.ws.client.RequestContext;

import classFiles.DBUser;
import classFiles.User;


public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/index.html";

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join"; 
        }

        // perform action and set URL
        if (action.equals("join")) {
            url = "/index.html";   
        }
        else if (action.equals("add")) {                
            
        	// get parameters from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");

            // store data in User object and save User object in database
            User user = new User(firstName, lastName, email);
            DBUser.insert(user);
            
 
            request.setAttribute("user", user);
            url = "/confirmation.jsp";  
        }
        
        // forward request and response
        ServletContext sc = getServletContext();
        sc.getRequestDispatcher(url).forward(request, response);;
        


      
	}
        
        protected void doPost(HttpServletRequest request, 
        		HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
