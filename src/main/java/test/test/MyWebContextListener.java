/**
 * 
 */
package test.test;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;
import org.springframework.web.servlet.mvc.SimpleControllerHandlerAdapter;
import org.springframework.web.servlet.mvc.annotation.AnnotationMethodHandlerAdapter;

/**
 * @title
 * @description
 * @author lvzhaoyang
 * @date 2017年11月3日下午2:43:21
 */
public class MyWebContextListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent event) {
		String param = event.getServletContext().getInitParameter("contextConfigLocation");
		System.out.println("contextConfigLocation:{}" + param);
	}

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		HandlerMethodReturnValueHandler h2;
		HandlerMethodArgumentResolver h1;
		DispatcherServlet ds;
		HttpRequestHandlerAdapter ad1;
		SimpleControllerHandlerAdapter ad2;
//		RequestMappingHandlerAdapter ad3;
	}

}
