package home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@ComponentScan
@EnableAutoConfiguration
 @EnableDiscoveryClient
@SpringBootApplication
public class ProductDetailsApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(new Object[] { ProductDetailsApplication.class }, args);
			}
	@Bean
	  public WebMvcConfigurer corsConfigurer() {
	      return new WebMvcConfigurerAdapter() {
	          @Override
	          public void addCorsMappings(CorsRegistry registry) {
	              registry.addMapping("/**").allowedOrigins("*");
	          }
	      };
	  }
	  
	  @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource= new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.setAllowCredentials(true);
        corsConfig.addAllowedOrigin("*");
        corsConfig.addAllowedHeader("*");
        corsConfig.addAllowedMethod("OPTIONS");
        corsConfig.addAllowedMethod("HEAD");
        corsConfig.addAllowedMethod("GET");
        corsConfig.addAllowedMethod("PUT");
        corsConfig.addAllowedMethod("POST");
        corsConfig.addAllowedMethod("DELETE");
        corsConfig.addAllowedMethod("PATCH");
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfig);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}
