package dev.orchids.celerity.common.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;

@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    WebMvcConfigurer.super.addResourceHandlers(registry);

    registry
      .addResourceHandler("/file/public/**")
      .addResourceLocations("file:///public/");


    File file = new File("public");
    if (!file.exists()) {
      boolean mkdir = file.mkdir();
    }
    registry
      .addResourceHandler("/public/**")
      .addResourceLocations(file.toURI().toString());
  }
}
