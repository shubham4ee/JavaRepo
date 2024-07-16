package day10.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@EnableWebMvc//Enabling the CALLBACK mechanism
@Configuration
public class SpringWebMvcConfigurer implements WebMvcConfigurer {
	//This class is meant for configuration of View Resolver
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver viewResolverRef = 
				new InternalResourceViewResolver();
		String prefix = "/WEB-INF/pages/";
		String suffix = ".jsp";
		viewResolverRef.setPrefix(prefix);
		viewResolverRef.setSuffix(suffix);
		return viewResolverRef;
	}
}
//  prefix+viewname+suffix
//   /WEB-INF/pages/index.jsp





