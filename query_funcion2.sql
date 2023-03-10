DROP FUNCTION IF EXISTS func2;

DELIMITER //

CREATE FUNCTION func2 (num TINYINT)
RETURNS TINYINT
COMMENT 'id posterior'
BEGIN
	RETURN
	(SELECT idD
    FROM dptos
    WHERE idD>idResult
    ORDER BY idD
    LIMIT 1);
END //

DELIMITER ;

SELECT func2();