package com.example.muiti.config;

import lombok.Data;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Data
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    // 接口版本号
    private final String version = "1.0";
    // 接口大标题
    private final String title = "微人事后端接口API";
    // 具体的描述
    private final String description = "微人事后端接口文档";
    // 服务说明 url
    private final String termsOfServiceUrl = "http://localhost:8080";
    // licence
    private final String license = "MIT";
    // licnce url
    private final String licenseUrl = "https://mit-license.org/";
    // 接口作者联系方式
    private final Contact contact = new Contact("zhuyan", "https://github.com/zhuyanv587", "1677391824@qq.com");

    @Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.vhrend.controller"))
                .build();
    }
    /**
     * 配置页面展示的基本信息：标题、描述、版本、服务条款、联系方式等
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title(title).description(description)
                .termsOfServiceUrl(termsOfServiceUrl).version(version)
                .license(license).licenseUrl(licenseUrl).contact(contact).build();
    }
}