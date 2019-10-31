package com.loginUsuario;

import java.util.HashMap;

public class login_Usuario 
{
	
	public static HashMap<String,String> listaUsuario; 

	static
	{
		HashMap<String, String> listaUsuario = new HashMap<String,String>();
		listaUsuario.put("valenA", "abc12");
		listaUsuario.put("loreB", "def34");
		listaUsuario.put("florC", "ghi56");
		
	}
	public static HashMap<String, String> getMap()
	{
		return listaUsuario;
	}
	
	public static HashMap<String, String> getListaUsuario() {
		return listaUsuario;
	}
	public static void setListaUsuario(HashMap<String, String> listaUsuario) {
		login_Usuario.listaUsuario = listaUsuario;
	}

	
	
}
