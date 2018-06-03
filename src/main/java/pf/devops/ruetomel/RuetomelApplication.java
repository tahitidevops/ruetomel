package pf.devops.ruetomel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class RuetomelApplication {
  public static void main(String[] args) {
    SpringApplication.run(RuetomelApplication.class, args);
  }
}
