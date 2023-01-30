
DROP DATABASE IF EXISTS ejemplo;

CREATE DATABASE ejemplo;

USE ejemplo;

CREATE TABLE dptos (
  idD     TINYINT NOT NULL PRIMARY KEY,
  nom    VARCHAR(15) NOT NULL,
  bloque CHAR,
  pto    FLOAT (6,2)
);

CREATE TABLE empleados (
  idE        SMALLINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  apellido   VARCHAR (15) NOT NULL,
  dir        VARCHAR (30) NOT NULL,
  fecha_alta DATE         NOT NULL,
  fecha_baja DATE,
  salario    FLOAT (6,2)  NOT NULL,
 #idD        TINYINT      NOT NULL REFERENCES dptos (idD) #No funciona por sí solo
  idD        TINYINT      NOT NULL,
						      INDEX fk_idD (idD),
                              FOREIGN KEY (idD) REFERENCES dptos(idD)
); 