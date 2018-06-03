package pf.devops.ruetomel.config;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class WebMvcConfig //extends WebMvcConfigurationSupport
{
//    @Override
    protected void addInterceptors(InterceptorRegistry registry)
    {
//        registry.addInterceptor(new ThymeleafLayoutInterceptor());
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver resolver = new SessionLocaleResolver();
        resolver.setDefaultLocale(Locale.FRENCH);

        return resolver;
    }
}