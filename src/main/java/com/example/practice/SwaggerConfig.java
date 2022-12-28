package com.example.practice;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//it is used to represent java class as a spring configuration class
//@Configuration
@EnableSwagger2
public class SwaggerConfig {


//    docket is predefined class which is used to define as a spring bean
//    docket class implememts DocumetationPlugin
   @Bean
    public Docket swaggerApiConfig(){
       return new Docket(DocumentationType.SWAGGER_2)
               .select()
               .apis(RequestHandlerSelectors.basePackage("com.example.swagger"))
               .paths(PathSelectors.any())
//              . paths(PathSelectors
//                select means which apis we have to select that specify in .apis method below
               //for which package class we have to generate the documentation
               .build();
   }

//    private ApiInfo apiInfo() {
//       return new ApiInfo(
//                  "Swagger API EXmaple By Smita",
//                  "API reference example",
//               "1.0.0",
//               "public API",
//               new Contact(
//                       "java techbooster",
//                       "https://www.youtube.com/watch?v=ARlz2-Twm-g",
//                       "smitabidwai@gmail.com"
//               ),
//               "Api licence open",
//               "https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox",
//               Collections.emptyList()
//       );

    }



