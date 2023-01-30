
# CREAR UNA FUNCION EN MYSQL PARA OBTENER EL DEPARTAMENTO CON MAYOR NUMERO DE EMPLEADOS



DELIMITER //

CREATE FUNCTION getDepartamentoMayor() RETURNS TINYINT

BEGIN


    DECLARE idnum TINYINT;
    DECLARE idconteo TINYINT;

    SELECT idD, count(*) as cuenta into @idnum, @idconteo from empleados group by idD ORDER BY cuenta DESC LIMIT 1 ;

    RETURN @idnum;
END//

DELIMITER ;

SELECT getDepartamentoMayor();

