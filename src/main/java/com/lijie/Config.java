package com.lijie;

import com.lijie.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;

/**
 * @author lijie7
 * @date 2018/1/30
 * @Description
 * @modified By
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.lijie")
public class Config extends WebMvcConfigurerAdapter {

    @Bean
    public FreeMarkerConfig getFreemarkConfig() {
//        FreeMarkerConfig config = new MyFreeMarkConfig();
//        return config;
        return null;
    }

//    @Bean
//    public ViewResolver htmlViewResolver() {
//        FreeMarkerViewResolver viewResolver = new FreeMarkerViewResolver();
//        viewResolver.setSuffix("*.html");
//        viewResolver.setContentType("text/html;charset=UTF-8");
//        viewResolver.setOrder(1);
//        return viewResolver;
//    }
//
//    @Bean
//    public ViewResolver viewResolver(SpringTemplateEngine templateEngine){
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine(templateEngine);
//        return viewResolver;
//    }
    // Thymeleaf驱动
//    @Bean
//    public TemplateEngine templateEngine(TemplateResolver templateResolver) {
//        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver);
//        return templateEngine;
//    }
//
//    // 模版解析器
//    @Bean
//    public TemplateResolver templateResolver() {
//        TemplateResolver templateResolver = new ServletContextTemplateResolver();
//        templateResolver.setPrefix("/WEB-INF/templates/");
//        templateResolver.setSuffix(".html");
//        templateResolver.setTemplateMode("HTML5");
//        return templateResolver;
//    }

//    @Bean
//    public ViewResolver jspViewResolver() {
//        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
//        viewResolver.setPrefix("WEB-INF/classes/views/");
//        viewResolver.setSuffix(".jsp");
//        viewResolver.setContentType("text/html;charset=UTF-8");
//        viewResolver.setOrder(0);
//        viewResolver.setViewClass(InternalResourceView.class);
//        return viewResolver;
//    }

    @Bean
    public ViewResolver htmlViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        viewResolver.setContentType("text/html;charset=UTF-8");
        viewResolver.setOrder(0);
        viewResolver.setViewClass(InternalResourceView.class);
        return viewResolver;
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getInterceptor()).excludePathPatterns("/login", "/login.html");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/views/**").addResourceLocations("classpath:/views/");
        super.addResourceHandlers(registry);
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
        super.addViewControllers(registry);
    }

    @Bean
    public MyInterceptor getInterceptor() {
        return new MyInterceptor();
    }


}
