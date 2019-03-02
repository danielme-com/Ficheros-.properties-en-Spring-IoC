package com.danielme.blog.spring.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Ficheros .properties en Spring
 * 
 * @author danielme.com
 * 
 */
public class Main {

    public static void main(String[] args) {
        // Se inicia programáticamente el contenedor de Spring y se obtiene el bean
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "/springContext.xml");*/
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        BeanSpring beanSpring = (BeanSpring) applicationContext.getBean("beanSpring");

        System.out.println(
                "cantidad: " + beanSpring.getCantidad() + ", usuario: " + beanSpring.getUsuario());
    }

}