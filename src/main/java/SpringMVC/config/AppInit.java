package SpringMVC.config;

import org.h2.server.web.WebServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    public void onStartup(ServletContext servletContext)
            throws ServletException {
        super.onStartup(servletContext);
        ServletRegistration.Dynamic servlet = servletContext
                .addServlet("h2-console", new WebServlet());
        servlet.setLoadOnStartup(2);
        servlet.addMapping("/console/*");
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{
                WebConfiguration.class
        };
    }

    // Тут добавляем конфигурацию, в которой инициализируем ViewResolver
    @Override
    protected Class<?>[] getServletConfigClasses() {

        return new Class<?>[]{
                WebConfiguration.class
        };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
