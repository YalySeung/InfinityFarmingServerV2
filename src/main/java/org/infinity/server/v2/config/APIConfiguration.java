package org.infinity.server.v2.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.infinity.server.v2.util.LocalDateSerializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.time.LocalDate;
import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"org.infinity.server.v2"})
public class APIConfiguration implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateSerializer())
                .create();

        GsonHttpMessageConverter converter = new GsonHttpMessageConverter(gson);
        converters.add(converter);
    }
}
