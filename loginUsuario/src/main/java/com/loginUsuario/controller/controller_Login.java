package com.loginUsuario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.loginUsuario.verificarUsuario;


@Controller
public class controller_Login 
{

	@GetMapping("/login")
	public String index(Model model) 
	{		
	    return "login";
	}
	
	@PostMapping("/login")
    public ModelAndView greetingSubmit(@ModelAttribute("usuario") String usuario, @ModelAttribute("password") String password) 
	{		
		ModelAndView modelView = new ModelAndView("crearUsuario");	
		
		boolean resultadoLogin = verificarUsuario.verificarUsuario();
		
		if (resultadoLogin == true)
		{
			return modelView;
		}
		else
		{
			resultadoLogin = verificarUsuario.crearUsuario(usuario,password);			 
		}
		
		modelView.addObject("usuario", usuario);
		modelView.addObject("password", password);
	
		
		return modelView;		
    }
	
	@GetMapping("/crearUsuario")
    public ModelAndView greetingMostrar(ModelAndView model) 
	{	
		System.out.println("el usuario fue creado con exito");
		return model;	
    }

	
}
