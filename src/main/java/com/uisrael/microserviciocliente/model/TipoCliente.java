package com.uisrael.microserviciocliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class TipoCliente {
	
	@Document(collection="cliente")
	@Getter
	@Setter
	@NoArgsConstructor
	public class Cliente {
		@Id
		private String idTipoCliente;
		private String Descripcion;
		private boolean estado; // 1:activo, 0:inactivo
	}

}
