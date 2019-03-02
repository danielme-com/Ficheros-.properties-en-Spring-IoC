package com.danielme.blog.spring.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class BeanSpring {

    @Autowired
    Environment enviroment;

    @Value("${valor.cantidad}")
    private Integer cantidad;

    @Value("${valor.usuario}")
    private String usuario;

    public Integer getCantidad() {
        return cantidad;
    }

    public String getUsuario() {
        return enviroment.getProperty("valor.usuario");
        //return usuario;
    }

}
