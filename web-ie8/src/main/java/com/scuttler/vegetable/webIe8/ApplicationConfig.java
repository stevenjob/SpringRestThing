package com.scuttler.vegetable.webIe8;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.script.ScriptTemplateConfigurer;
import org.springframework.web.servlet.view.script.ScriptTemplateViewResolver;

@Configuration
public class ApplicationConfig {

    @Bean
    public ScriptTemplateConfigurer handlebarsConfigurer() {
        ScriptTemplateConfigurer configurer = new ScriptTemplateConfigurer();
        configurer.setEngineName("nashorn");
        configurer.setScripts("/static/polyfill.js",
                "/META-INF/resources/webjars/handlebars/4.0.5/handlebars.js",
                "/static/render.js");
        configurer.setRenderFunction("render");
        configurer.setSharedEngine(false);
        return configurer;
    }

    @Bean
    public ViewResolver viewResolver() {
        ScriptTemplateViewResolver viewResolver = new ScriptTemplateViewResolver();
        viewResolver.setPrefix("/static/templates/");
        viewResolver.setSuffix(".html");
        return viewResolver;
    }
}
