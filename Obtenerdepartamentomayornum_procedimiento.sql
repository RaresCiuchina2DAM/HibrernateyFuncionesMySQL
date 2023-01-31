
-- Crear un procedimiento que simule la  funcion anterior

DROP PROCEDURE IF EXISTS proc1;

DELIMITER //

CREATE PROCEDURE getDepartamentoMayorProcedure (OUT idResult TINYINT)

BEGIN
    DECLARE idnum TINYINT;
    DECLARE idconteo TINYINT;
    SELECT idD, count(*) as cuenta into @idnum, @idconteo from empleados group by idD ORDER BY cuenta ASC, idD DESC LIMIT 1 ;
    SET idResult = @idnum;
END //


DELIMITER ;