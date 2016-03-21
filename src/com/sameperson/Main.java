package com.sameperson;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

import javax.servlet.Servlet;

public class Main {

    public static void main(String... args) {

        Server server = new Server(4242);

        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);

        handler.addServletWithMapping(GreetingServlet.class, "/*");

        try {
            server.start();
            server.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
