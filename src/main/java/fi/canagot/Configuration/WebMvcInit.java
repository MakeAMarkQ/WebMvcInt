package fi.canagot.Configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebMvcInit implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext rootContext= new AnnotationConfigWebApplicationContext();
        rootContext.register((WebMvcConfig.class));

        ServletRegistration.Dynamic registeration = servletContext.addServlet("springDemo4Mvc",new DispatcherServlet(rootContext));
        registeration.addMapping("/");
        registeration.setLoadOnStartup(1);
    }
}
