package com.redhot;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		
		//HttpSession session=req.getSession();
		//int k=(int)session.getAttribute("k");//session management
		
		//int k=(int)req.getAttribute("k");
		//k=k*k;
		//int k=Integer.parseInt(req.getParameter("k"));//url redirect
		
		Cookie cookies[]=req.getCookies();
       
		int k = 0;
		for(Cookie c:cookies) {
        if(c.getName().equals("k")) {
        	k=Integer.parseInt(c.getValue());
        }
        }
		
		k=k*k;
		
		PrintWriter out=res.getWriter();
		out.println("square is "+ k);
		
	}

}
