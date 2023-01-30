#procedimiento que le damos un departamento y
#nos devuelve el inmediatamente superior

DROP PROCEDURE IF EXISTS proc1;

DELIMITER //

CREATE PROCEDURE proc1 (IN idPantalla TINYINT, OUT idResult TINYINT)
COMMENT 'id posterior'
BEGIN
	SELECT idD
    INTO idResult
    FROM dptos
    WHERE idD>idPantalla
    ORDER BY idD
    LIMIT 1;
END //

DELIMITER ;

CALL nom_proc (100, @IDd);
SELECT @idD;

