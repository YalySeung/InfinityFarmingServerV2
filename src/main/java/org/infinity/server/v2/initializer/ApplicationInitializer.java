package org.infinity.server.v2.initializer;

import org.infinity.server.v2.config.APIConfiguration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class ApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext apiContext = new AnnotationConfigWebApplicationContext();
        apiContext.register(APIConfiguration.class);

        DispatcherServlet apiDispatcherServlet = new DispatcherServlet(apiContext);

        ServletRegistration.Dynamic apiDispatcher = servletContext.addServlet("apiDispatcher", apiDispatcherServlet);
        apiDispatcher.addMapping("/*");
    }
}
