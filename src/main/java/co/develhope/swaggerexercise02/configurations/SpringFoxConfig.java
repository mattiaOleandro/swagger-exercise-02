package co.develhope.swaggerexercise02.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfo(
                        "Exercise Swagger 02",
                        "Swagger exercise 02 on API documentation",
                        "1.0.0",
                        "https://en.wikipedia.org/wiki/MIT_License",
                        new Contact("Mattia", "https://github.com/mattiaOleandro", "mattiaoleandro@gmail.com"),
                        "MIT",
                        "https://en.wikipedia.org/wiki/MIT_License",
                        Collections.emptyList()
                )).tags(new Tag("math-controller", "The math controller"))
                ;
    }
}
