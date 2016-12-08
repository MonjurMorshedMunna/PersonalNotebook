import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by munna on 12/6/16.
 */

@ComponentScan("notebook")
@SpringBootApplication
public class NotebookApp {
    public static void main(String[] args){
        SpringApplication.run(NotebookApp.class, args);
    }
}
