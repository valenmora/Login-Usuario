package com.loginUsuario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Crear una aplicacion web que logue un usuario. Si el usuario no exite mostrar una pagina para cargar el nombre y la password
//del nuevo usuario y lo inserta. 

//test 
// loguear el nuevo usario y tener exito

@SpringBootApplication
public class login_Main {

	public static void main(String[] args) {
        SpringApplication.run(login_Main.class, args);
	}

}
