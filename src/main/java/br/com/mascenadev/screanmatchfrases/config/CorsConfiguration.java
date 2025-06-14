package br.com.mascenadev.screanmatchfrases.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Gilberto Dev
 * @version 1.0.0
 * @since 2024-06-14
 * <p>
 * This configuration class enables Cross-Origin Resource Sharing (CORS) for the Spring Boot application.
 * It implements {@link WebMvcConfigurer} to customize the CORS settings.
 *
 * <p>
 * Specifically, this configuration allows requests from the origin {@code http://127.0.0.1:5500}
 * to access any endpoint ({@code "/**"}) of this API. It permits a wide range of HTTP methods
 * including GET, POST, PUT, DELETE, OPTIONS, HEAD, TRACE, and CONNECT.
 * </p>
 */
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    /**
     * Configures CORS mappings for the application.
     *
     * <p>
     * This method is overridden from {@link WebMvcConfigurer} to specify
     * which origins, HTTP methods, and headers are allowed for cross-origin requests.
     * </p>
     *
     * @param registry The {@link CorsRegistry} to which CORS mappings are added.
     *                 This registry is used to configure global and URL-specific CORS settings.
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://127.0.0.1:5500")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD", "TRACE", "CONNECT");
    }
}