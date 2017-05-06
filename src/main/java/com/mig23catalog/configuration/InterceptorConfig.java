package com.mig23catalog.configuration;

import com.mig23catalog.interceptors.CounterInterceptor;
import com.mig23catalog.interceptors.IpInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        super.addInterceptors(registry);
        registry.addInterceptor(new IpInterceptor()).addPathPatterns("/viruses/*").addPathPatterns("/map").addPathPatterns("/");
        registry.addInterceptor(new CounterInterceptor()).addPathPatterns("/");
    }


}
