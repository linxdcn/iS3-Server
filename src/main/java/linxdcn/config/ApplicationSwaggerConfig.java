package linxdcn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by linxiaodong on 4/7/17.
 */
@Configuration
@EnableSwagger2
public class ApplicationSwaggerConfig {
    @Bean
    public Docket addUserDocket() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        @SuppressWarnings("deprecation")
        ApiInfo apiInfo = new ApiInfo(
                "iS3-Server Document API",
                "API Document",
                "V1.0.0",
                "",
                "linxdcn@foxmail.com",
                "",
                "");
        docket.apiInfo(apiInfo).select()
                .apis(RequestHandlerSelectors.basePackage("linxdcn"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }
}
