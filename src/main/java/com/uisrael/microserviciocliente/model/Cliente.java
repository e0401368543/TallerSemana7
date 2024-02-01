package com.uisrael.microserviciocliente.model;



//import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection="cliente")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
	@Id
	private String idCliente;
	private String IdTipocliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private String telefono;
	private String ci;
	private String correo;
	//private Date fechaNacimiento;
	private boolean estado; // 1:activo, 0:inactivo

	

}
