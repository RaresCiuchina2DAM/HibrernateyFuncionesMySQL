#procedimiento que le damos un departamento y
#nos devuelve el inmediatamente superior

DROP PROCEDURE IF EXISTS proc2;

DELIMITER //

CREATE PROCEDURE proc2 (INOUT idResult TINYINT)
COMMENT 'id posterior'
BEGIN
	SELECT idD
    INTO idResult
    FROM dptos
    WHERE idD>idResult
    ORDER BY idD
    LIMIT 1;
END //

DELIMITER ;

set @idD=70;
CALL proc2 (@IDd);
SELECT @idD;