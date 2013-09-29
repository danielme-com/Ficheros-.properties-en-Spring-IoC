package com.danielme.blog.spring.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BeanSpring
{
	@Value("${valor.cantidad}")
	private Integer cantidad;
	
	@Value("${valor.usuario}")
	private String usuario;

	public Integer getCantidad() 
	{
		return cantidad;
	}	

	public String getUsuario() 
	{
		return usuario;
	}	
	
	
}
