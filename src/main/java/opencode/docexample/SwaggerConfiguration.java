package opencode.docexample;

import org.springframework.context.annotation.Bean;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfiguration {
	
	 @Bean
	  public Docket myApi() {
		 
		 return new Docket(DocumentationType.SWAGGER_2)
		 .apiInfo(getApiInfo());
		
	 }
	 
	 
	 private ApiInfo getApiInfo(){
		 
		 //We do not use all info
		 ApiInfo info = new ApiInfo("My Rest API", "Auto generated Rest API Documentation","1.0","","","","");
		 
		 return info;
	 }
	

}
