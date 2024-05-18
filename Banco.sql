-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema cad_clientes
-- -----------------------------------------------------

CREATE SCHEMA IF NOT EXISTS `cad_clientes` DEFAULT CHARACTER SET utf8 ;
USE `cad_clientes` ;

-- -----------------------------------------------------
-- Table `cad_clientes`.`CLIENTE`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cad_clientes`.`CLIENTE` (
    `ID_CLIENTE` INT NOT NULL AUTO_INCREMENT,
    `NOME` VARCHAR(200) NOT NULL,
    `EMAIL` VARCHAR(200) NOT NULL,
    `IDADE` INT NOT NULL,
    `CPF` VARCHAR(200) NOT NULL,
    `SEXO` VARCHAR(200) NOT NULL,
    `SENHA` VARCHAR(200) NOT NULL,
    PRIMARY KEY (`ID_CLIENTE`)
) ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `cad_clientes`.`EVENTOS`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cad_clientes`.`EVENTOS` (
    `ID_EVENTOS` INT NOT NULL AUTO_INCREMENT,
    `NOME` VARCHAR(200) NOT NULL,
    `DESCRICAO` VARCHAR(200) NOT NULL,
    `DATAINICIO` VARCHAR(200) NOT NULL,
    `DATAFIM` VARCHAR(200) NOT NULL,
    `HORAINICIO` VARCHAR(200) NOT NULL,
    `HORAFIM` VARCHAR(200) NOT NULL,
    PRIMARY KEY (`ID_EVENTOS`)
) ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

SELECT * FROM CLIENTE;
SELECT * FROM EVENTOS;