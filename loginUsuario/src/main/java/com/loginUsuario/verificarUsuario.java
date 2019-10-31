package com.loginUsuario;

import java.util.HashMap;

public class verificarUsuario {

	
	private static String usuario;
	private static String password;
	
	
	
	public static boolean verificarUsuario() {
		boolean ingreso = false;
		try
		{
			
			for (String i : login_Usuario.listaUsuario.keySet()) 
			{
				if (i == getUsuario() && login_Usuario.listaUsuario.get(i) == getPassword())
				{
					ingreso = true;
				}
				else if (i == null && login_Usuario.listaUsuario.get(i) == null)
				{
					ingreso = false;			
				}
				else
				{
					ingreso = false;				
				}
				
			}
			
			return ingreso;
		}catch (Exception e)
		{
			System.out.println("ERROR .... ");
		}
		return ingreso;
	}



	public static boolean crearUsuario(String usuario, String password) {
		login_Usuario.listaUsuario.put(usuario, password);
		login_Usuario.setListaUsuario(login_Usuario.listaUsuario);
		return true;
	}
	
	public static String getUsuario() {
		return usuario;
	}
	public static String getPassword() {
		return password;
	}

	public static void setUsuario(String usuario) {
		verificarUsuario.usuario = usuario;
	}

	public static void setPassword(String password) {
		verificarUsuario.password = password;
	}

}
