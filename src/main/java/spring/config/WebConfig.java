package spring.config;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                    .allowedOrigins("*")
                    .allowedHeaders("*")
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD")
                    .maxAge(-1)   // add maxAge
                    .allowCredentials(false);
  }