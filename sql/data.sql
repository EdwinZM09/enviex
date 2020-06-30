INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio) VALUES ("Belen", "Vargas", 5539683312, 1);
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio) VALUES ("Guillermo", "Morales", 5534768902, 1);
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio) VALUES ("Alex", "Perez", 5591027345, 4);
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio) VALUES ("Antonio", "Santibañez", 5512124471, 2);
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio) VALUES ("Jazmin", "Rodriguez", 5534558900, 3);

INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) VALUES ("Benito Juarez #4", "santa martha", "iztapalapa", 09560, "CDMX");
INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) VALUES ("insurgentes #123", "Roma", "Benito Juarez", 078923, "CDMX");
INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) VALUES ("popocatepetl #44", "San Lorenzo Tezonco", "Tlahuac", 098765, "CDMX");
INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) VALUES ("Eje central #91", "Anzures", "Cuahutemoc", 088653, "CDMX");

INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente) VALUES ("Pantalon verde #32", "lettpamoda", 1); 
INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente) VALUES ("audifonos bluethoo", "frikiplaza",7);
INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente) VALUES ("Celular Redmi note 8", "Walmart",9);

INSERT INTO cliente ( id_persona) VALUES (4);
INSERT INTO cliente( id_persona) VALUES (7);
INSERT INTO cliente( id_persona) VALUES (8);
INSERT INTO cliente( id_persona) VALUES (6); 


select * from persona