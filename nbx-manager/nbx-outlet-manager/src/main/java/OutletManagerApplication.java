import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OutletManagerApplication {

    public void main(String[] args) {
        SpringApplication.run(OutletManagerApplication.class, args);
    }
}
