package com.example.Ejercicios_Spring_789.Config;

import org.springframework.context.annotation.*;
import springfox.documentation.builders.*;
import springfox.documentation.service.*;
import springfox.documentation.spi.*;
import springfox.documentation.spring.web.plugins.Docket;
import java.util.*;

/**
 * configuracion Swagger para la generacion de documentación de API REST
 * */
@Configuration
public class SwaggerConfig {
    @Bean
    public Docket api(){
        ApiInfo api= new ApiInfo("SpringBoot Book REST",
                "Una api de biblioteca",
                "1.0",
                "https://www.linkedin.com/in/alejandra-guardado-méndez/",
                new Contact("Alejandra", "https://www.linkedin.com/in/alejandra-guardado-méndez/", "aleguamen_@hotmail.com"),
                "UANL",
                "https://www.linkedin.com/in/alejandra-guardado-méndez/",
                Collections.emptyList());

        return  new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(api).
                select().
                apis(RequestHandlerSelectors.any()).
                paths(PathSelectors.any()).
                build();
    }
}
