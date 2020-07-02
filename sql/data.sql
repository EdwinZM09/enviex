INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) 
	VALUES ("Benito Juarez #4", "santa martha", "iztapalapa", 09560, "CDMX");
INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) 	# DOMICILIO
	VALUES ("insurgentes #123", "Roma", "Benito Juarez", 078923, "CDMX");
INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) 
	VALUES ("popocatepetl #44", "San Lorenzo Tezonco", "Tlahuac", 098765, "CDMX");
INSERT INTO domicilio ( calle, colonia, alcaldia, codigo_postal, ciudad) 
	VALUES ("Eje central #91", "Anzures", "Cuahutemoc", 088653, "CDMX");


INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio) 
	VALUES ("Belen", "Vargas", 5539683312, 1);
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio)    # Guillermo
	VALUES ("Guillermo", "Morales", 5534768902, 1);
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio, create_timestamp, update_timestamp) 
	VALUES ("Alex", "Perez", 5591027345, 4, "2038-01-19 03:14:07", "2038-01-19 03:14:07");
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio, create_timestamp, update_timestamp) 
	VALUES ("Antonio", "Santibañez", 5512124471, 2, "2038-01-19 03:14:07", "2038-01-19 03:14:07");
INSERT INTO persona ( nombre, apellido, telefono_celular, id_domicilio, create_timestamp, update_timestamp) 
	VALUES ("Jazmin", "Rodriguez", 5534558900, 3, "2038-01-19 03:14:07", "2038-01-19 03:14:07");


INSERT INTO cliente( id_persona, create_timestamp, update_timestamp) 
	VALUES (1, "2038-01-19 03:14:07", "2038-01-19 03:14:07");
INSERT INTO cliente( id_persona, create_timestamp, update_timestamp)    # CLIENTE 
	VALUES (2, "2038-01-19 03:14:07", "2038-01-19 03:14:07");
INSERT INTO cliente( id_persona, create_timestamp, update_timestamp) 
	VALUES (3, "2038-01-19 03:14:07", "2038-01-19 03:14:07");
INSERT INTO cliente( id_persona, create_timestamp, update_timestamp) 
	VALUES (4, "2038-01-19 03:14:07", "2038-01-19 03:14:07"); 


INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente, create_timestamp, update_timestamp) 
	VALUES ("Pantalon verde #32", "lettpamoda", 1, "2038-01-19 03:14:07", "2038-01-19 03:14:07"); 
INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente, create_timestamp, update_timestamp)   # PEDIDO
	VALUES ("audifonos bluethoo", "frikiplaza",2, "2038-01-19 03:14:07", "2038-01-19 03:14:07");
INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente, create_timestamp, update_timestamp) 
	VALUES ("Celular Redmi note 8", "Walmart",3, "2038-01-19 03:14:07", "2038-01-19 03:14:07");


INSERT INTO venta ( monto_pagar, tipo_pago, id_pedido, create_timestamp, update_timestamp) 
	VALUES (100, "efectivo", 1, "2038-01-19 03:14:07", "2038-01-19 03:14:07"); 
INSERT INTO venta ( monto_pagar, tipo_pago, id_pedido, create_timestamp, update_timestamp) 
	VALUES (100, "efectivo", 3, "2038-01-19 03:14:07", "2038-01-19 03:14:07"); 

INSERT INTO venta ( monto_pagar, tipo_pago, id_pedido, create_timestamp, update_timestamp)  # VENTA
	VALUES (100, "efectivo", 2, "2038-01-19 03:14:07", "2038-01-19 03:14:07"); 


SELECT * FROM persona;


# Must select Guillermo, Roma, frikie plaza
SELECT p.nombre, d.colonia, pe.nombre_bazar, v.monto_pagar
FROM persona p, domicilio d, pedido pe, venta v, cliente c
WHERE v.id_venta = 3
	AND pe.id_pedido = v.id_pedido
    AND pe.id_cliente = c.id_cliente
    AND c.id_persona = p.id_persona
    AND p.id_domicilio = d.id_domicilio;

# Must update Guillermo from table persona
UPDATE persona
SET id_domicilio = 2
WHERE id_persona = 2;

# Must update timestamps for ids 1 and 2
UPDATE persona
SET create_timestamp = "2038-01-19 03:14:07", update_timestamp = "2038-01-19 03:14:07"
WHERE id_persona = 2
	OR id_persona = 1; 
# WHERE nombre = "Guillermo"
	


