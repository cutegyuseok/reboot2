package org.example.reboot2.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("스프링 다시보기 프로젝트")
                        .description("기존의 스플 2.XX 버전대의 기능을 3.XX 버전에서 구현하기")
                        .version("1.0.0"));
//                .components(new Components()
//                        .addSecuritySchemes("bearer-key",
//                                new io.swagger.v3.oas.models.security.SecurityScheme()
//                                        .type(Type.HTTP)
//                                        .scheme("bearer")
//                                        .bearerFormat("JWT")));

    }

}