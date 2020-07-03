
/*
CREATE TABLE domicilio (
	id_domicilio int NOT NULL AUTO_INCREMENT,
	calle varchar(50),
	colonia varchar(50) ,
	alcaldia varchar(50),
	codigo_postal int(11), 
	ciudad varchar(50),
    create_timestamp varchar(50),
    update_timestamp varchar(50),
    PRIMARY KEY (id_domicilio),
	UNIQUE (id_domicilio)
);

CREATE TABLE cliente (
	id_cliente int NOT NULL AUTO_INCREMENT,
	nombre varchar(50),
	apellido varchar(50),
	telefono bigint,
	--id_domicilio int(11),
	create_timestamp varchar(50),
	update_timestamp varchar(50),
	PRIMARY KEY (id_cliente),
	--FOREIGN KEY (id_domicilio) REFERENCES domicilio (id_domicilio),
	UNIQUE (id_cliente, telefono) 
);

/*
CREATE TABLE pedido (
	id_pedido INT NOT NULL AUTO_INCREMENT,
	descripcion_pedido VARCHAR (100),
	nombre_bazar VARCHAR(100),
	id_cliente INT,
	create_timestamp varchar(50),
	update_timestamp varchar(50),
	PRIMARY KEY (id_pedido),	
	FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente),
	unique (id_pedido)
);

CREATE TABLE venta (
	id_venta INT NOT NULL AUTO_INCREMENT,
	monto_pagar INT, 
	tipo_pago VARCHAR (45),
	id_pedido INT, 
	create_timestamp varchar(50),
	update_timestamp varchar(50),
	PRIMARY KEY (id_venta),
	FOREIGN KEY (id_pedido) REFERENCES pedido (id_pedido), 
	unique (id_venta)
);
*/
