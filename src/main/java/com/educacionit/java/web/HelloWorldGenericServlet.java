
package com.educacionit.java.web;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class HelloWorldGenericServlet extends GenericServlet {


    public HelloWorldGenericServlet() {
    
        super ();
    }   
    
    
    @Override 
    public void service (ServletRequest request, ServletResponse response) throws IOException {
        
        response.setContentType ("text/html"); 
        
        PrintWriter out = response.getWriter ();
        
        out.println ("<h2>Hello World</h3>");
        out.println ("<h3>GenericServlet</h3>");

        out.close ();
    } 
}