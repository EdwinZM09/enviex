create database enviex;
use enviex;

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
  UNIQUE (id_domicilio));

CREATE TABLE persona 
(id_persona int NOT NULL AUTO_INCREMENT,
nombre varchar(50),
apellido varchar(50),
telefono_celular bigint,
id_domicilio int(11),
create_timestamp varchar(50),
update_timestamp varchar(50),
PRIMARY KEY (id_persona),
FOREIGN KEY (id_domicilio) REFERENCES domicilio (id_domicilio),
UNIQUE (id_persona, telefono_celular ) );

CREATE TABLE cliente 
( id_cliente INT NOT NULL AUTO_INCREMENT,
 id_persona INT, 
 create_timestamp varchar(50),
 update_timestamp varchar(50),
 PRIMARY KEY (id_cliente),
 FOREIGN KEY (id_persona)REFERENCES persona (id_persona),
 unique (id_cliente));
  
CREATE TABLE pedido 
(id_pedido INT NOT NULL AUTO_INCREMENT,
descripcion_pedido VARCHAR (100),
nombre_bazar VARCHAR(100),
id_cliente INT,
create_timestamp varchar(50),
update_timestamp varchar(50),
PRIMARY KEY (id_pedido),
FOREIGN KEY (id_cliente) REFERENCES cliente (id_cliente),
unique (id_pedido));

drop table venta;
CREATE TABLE venta 
(id_venta INT NOT NULL AUTO_INCREMENT,
monto_pagar INT, 
tipo_pago VARCHAR (45),
id_pedido INT, 
create_timestamp varchar(50),
update_timestamp varchar(50),
PRIMARY KEY (id_venta),
FOREIGN KEY (id_pedido) REFERENCES pedido (id_pedido), 
unique (id_venta));

; 
