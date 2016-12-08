package notebook.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by munna on 12/8/16.
 */
@Configuration
@EnableWebMvc
public class CorsConfiguration extends WebMvcConfigurerAdapter{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/notebook")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("PUT","DELETE","POST","GET")
                .allowCredentials(false).maxAge(3600);
    }
}
