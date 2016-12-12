import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by munna on 12/6/16.
 */

@ComponentScan("notebook")
@PropertySource("application-postgres.properties")
@SpringBootApplication
public class NotebookApp {
    public static void main(String[] args){
        SpringApplication.run(NotebookApp.class, args);
    }
}
