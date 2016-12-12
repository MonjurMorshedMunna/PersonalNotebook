import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by munna on 12/6/16.
 */

@ComponentScan("notebook")
@PropertySource("application-postgres.properties")
@EnableJpaRepositories(basePackages = "notebook.repositories")
@EntityScan(basePackages = "notebook.model")
@SpringBootApplication
public class NotebookApp {
    public static void main(String[] args){
        SpringApplication.run(NotebookApp.class, args);
    }
}
