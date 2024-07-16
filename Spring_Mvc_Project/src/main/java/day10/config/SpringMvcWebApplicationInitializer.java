package day10.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

public class SpringMvcWebApplicationInitializer implements WebApplicationInitializer {
	//This class is meant for configuration of Front Controller: DispatcherServlet
	//in such a way that it accepts all the incoming requests.
	@Override
	public void onStartup(ServletContext servletContextRef) throws ServletException {
		// This method gets invoked when the application is launched.
		WebApplicationContext webContextRef = getWebApplicationContext();
		//Creating an object of DispatcherServlet
		DispatcherServlet frontControllerServletRef = 
				new DispatcherServlet(webContextRef);
		
		ServletRegistration.Dynamic registration = 
				servletContextRef.addServlet("myFrontController", frontControllerServletRef);
		registration.addMapping("/");//This is equivalent to <url-pattern>/</url-pattern> in web.xml
		
	}
	
	private WebApplicationContext getWebApplicationContext() {
		AnnotationConfigWebApplicationContext webApplicationContextRef = 
				new AnnotationConfigWebApplicationContext();
		webApplicationContextRef.setConfigLocation("day10");
		//The above code is equivalent to @ComponentScan(basePackages = {"day10"})
		return webApplicationContextRef;
	}

}








