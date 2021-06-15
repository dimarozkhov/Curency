package springcourse.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class mySptingMvcDispatcherServletInitialaizer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public mySptingMvcDispatcherServletInitialaizer() {
    }

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
