DROP FUNCTION IF EXISTS func1;

DELIMITER //

CREATE FUNCTION func1 ()
RETURNS TINYINT
COMMENT '1 dpto'
BEGIN
	RETURN
	(SELECT idD
    FROM dptos
    ORDER BY idD
    LIMIT 1);
END //

DELIMITER ;

SELECT func1();