INSERT INTO domicilio (id_domicilio, calle, colonia, alcaldia, codigo_postal, ciudad, create_timestamp, update_timestamp) 
VALUES (1001, 'Benito Juarez #4', 'santa martha', 'iztapalapa', 09560, 'CDMX', '2018-01-19 03:14:07', '2018-01-19 03:14:07'),
	 (1002, 'insurgentes #123', 'Roma', 'Benito Juarez', 078923, 'CDMX', '2018-01-19 03:14:07', '2018-01-19 03:14:07'),
	 (1003, 'popocatepetl #44', 'San Lorenzo Tezonco', 'Tlahuac', 098765, 'CDMX', '2018-01-19 03:14:07', '2018-01-19 03:14:07'),
	 (1004, 'Eje central #91', 'Anzures', 'Cuahutemoc', 088653, 'CDMX', '2018-01-19 03:14:07', '2018-01-19 03:14:07');


INSERT INTO cliente (id_cliente, nombre, apellido, telefono, create_timestamp, update_timestamp) 
VALUES (1001, 'Ramon', 'Ayala', 57584242, '2018-01-19 03:14:07', '2018-01-19 03:14:07'),
	   (1002, 'Celia', 'Cruz', 32157584242, '2008-01-19 03:14:07', '2008-01-19 03:14:07');
	
/*
INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente, create_timestamp, update_timestamp) 
	VALUES ('Pantalon verde #32', 'lettpamoda', 1, '2038-01-19 03:14:07', '2038-01-19 03:14:07'); 
INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente, create_timestamp, update_timestamp)   # PEDIDO
	VALUES ('audifonos bluethoo', 'frikiplaza',2, '2038-01-19 03:14:07', '2038-01-19 03:14:07');
INSERT INTO pedido ( descripcion_pedido, nombre_bazar, id_cliente, create_timestamp, update_timestamp) 
	VALUES ('Celular Redmi note 8', 'Walmart',3, '2038-01-19 03:14:07', '2038-01-19 03:14:07');


INSERT INTO venta ( monto_pagar, tipo_pago, id_pedido, create_timestamp, update_timestamp) 
	VALUES (100, 'efectivo', 1, '2038-01-19 03:14:07', '2038-01-19 03:14:07'); 
INSERT INTO venta ( monto_pagar, tipo_pago, id_pedido, create_timestamp, update_timestamp) 
	VALUES (100, 'efectivo', 3, '2038-01-19 03:14:07', '2038-01-19 03:14:07'); 

INSERT INTO venta ( monto_pagar, tipo_pago, id_pedido, create_timestamp, update_timestamp)  # VENTA
	VALUES (100, 'efectivo', 2, '2038-01-19 03:14:07', '2038-01-19 03:14:07'); 


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
SET create_timestamp = '2038-01-19 03:14:07', update_timestamp = '2038-01-19 03:14:07'
WHERE id_persona = 2
	OR id_persona = 1; 
# WHERE nombre = 'Guillermo'
	


*/