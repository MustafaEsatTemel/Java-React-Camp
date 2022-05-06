package me.mustafaesattemel.northwing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2//swaggeri baslatan anotasyon. Butun controllerlerini tariyor apileri buluyor onlara ayar cekiyor.
public class NorthwingApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwingApplication.class, args);
	}
	
	
	//swagger için gerekli bir methodu yazdik
	 @Bean
	    public Docket api() { 
	        return new Docket(DocumentationType.SWAGGER_2)  
	          .select()                                  
	          .apis(RequestHandlerSelectors.basePackage("me.mustafaesattemel.northwing"))                                     
	          .build();                                           
	        //RequestHandlerSelectos bizim belirttigimiz paketteki
	        // request'leri(orn: RestController) aradi ve bi guzel elden gecirdi.
	    }

}
