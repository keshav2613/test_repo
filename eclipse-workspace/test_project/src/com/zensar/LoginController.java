package com.zensar;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		String requestAction = request.getParameter("requestAction");
		
if(requestAction.equalsIgnoreCase("login")) {
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
		
			
			LoginRepository loginRepository = new LoginRepository();
			boolean loginResult = loginRepository.Login(username, password);
			
			if(loginResult) {
				try {
					
					
					response.sendRedirect("index.jsp");
				}catch(Exception e) {
					System.out.println("Exception occured"+ e);
				}
				
				
			}
			 else {
	                try {
	                    request.setAttribute("errormsg","Invalid");
	                    RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
	                    rd.forward(request, response);
	                    
	                } catch (Exception e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
			
			
	}
		else if(requestAction.equalsIgnoreCase("logout")) {
            try {
                request.setAttribute("logoutmsg", "logout");
                RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                rd.forward(request, response);
            } catch (Exception e) {
                System.out.println("Exception occured:"+e);
            }
        }
		
	}

		
		
		
		
		
		
		
	}


