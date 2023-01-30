# CREAR UN PROCEDIMIENTO EN MYSQL PARA DAR DE ALTO A UN
# EMPLEADO CON EL MENOR NUMERO
# DE CAMPOS POSIBLES


#
DELIMITER //

CREATE PROCEDURE darDeAltaEmpleado (
	IN apellido VARCHAR(15), 
	IN DIR VARCHAR(30),
	IN SALARIO FLOAT(6,2),
	IN idE tinyint)
 
 BEGIN
	
    INSERT INTO ejemplo.empleados (apellido, DIR,SALARIO, idE)
		VALUES (apellido,DIR,current_date(),SALARIO,idE);
        
END//
 DELIMITER :
