package noice.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Noice
 */
@SpringBootApplication
@EnableDiscoveryClient
public class CyjAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(CyjAuthApplication.class, args);
    }

}
