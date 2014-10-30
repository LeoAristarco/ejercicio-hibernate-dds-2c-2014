CREATE SCHEMA IF NOT EXISTS `prueba` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci ;
USE `prueba` ;

CREATE  TABLE IF NOT EXISTS `prueba`.`Proyectos` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nombre` varchar(50),

	PRIMARY KEY (`id`)
);

CREATE  TABLE IF NOT EXISTS `prueba`.`Empleados` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`nombre` varchar(50),	
	`apellido` varchar(50),
	`puesto` varchar(50),
	`telefono` varchar(50),
	`direccion` varchar(50),
	`salario` int,

	PRIMARY KEY (`id`)
);

CREATE  TABLE IF NOT EXISTS `prueba`.`Licencias` (
	`id` INT NOT NULL AUTO_INCREMENT,
	
	PRIMARY KEY (`id`)
);

CREATE  TABLE IF NOT EXISTS `prueba`.`Razones` (
	`id` INT NOT NULL AUTO_INCREMENT,
	`descripcion` varchar(50),	
	
	PRIMARY KEY (`id`)
);