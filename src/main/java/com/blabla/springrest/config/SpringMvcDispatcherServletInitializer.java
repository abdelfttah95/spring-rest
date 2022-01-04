package com.blabla.springrest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 *
 * @author abdel
 */
public class SpringMvcDispatcherServletInitializer
        extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class [] { AppConfig.class } ;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
