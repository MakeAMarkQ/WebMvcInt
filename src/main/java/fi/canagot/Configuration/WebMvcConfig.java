package fi.canagot.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@Configuration
@ComponentScan("fi.canagot")
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {
@Bean
    public UrlBasedViewResolver urlBasedViewResolver(){
        UrlBasedViewResolver urlBaseViewResolver=new UrlBasedViewResolver();
        urlBaseViewResolver.setPrefix("/WEB-INF/views/");
        urlBaseViewResolver.setSuffix(".jsp");
        urlBaseViewResolver.setViewClass(JstlView.class);
        return urlBaseViewResolver;
    }
}

