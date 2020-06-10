package dev.nurmi.pressthebuttonbackend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Count API", version="1.0", description = "Service that provides data of how many time the button has been pressed"))
public class PressTheButtonBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PressTheButtonBackendApplication.class, args);
    }

}
