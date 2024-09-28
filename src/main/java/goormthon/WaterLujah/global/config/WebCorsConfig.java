package goormthon.WaterLujah.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebCorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("https://web-team6-water-lujah-fe-lxfol2lf38345220.sel5.cloudtype.app/") // 클라이언트 도메인
            .allowedMethods("POST")
            .allowedHeaders("*")
            .allowCredentials(true);
    }
}
