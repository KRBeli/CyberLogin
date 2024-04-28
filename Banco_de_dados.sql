CREATE DATABASE db_usuario;
USE db_usuario;

CREATE TABLE tb_usuario(
codigo INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200),
idade VARCHAR(200),
email VARCHAR(200),
sexo VARCHAR(200),
cpf VARCHAR(200)
);

CREATE DATABASE db_eventos;
USE db_eventos;

CREATE TABLE tb_eventos(
codigo INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(200),
descricaoDetalhada VARCHAR(200),
dataHorarioInicio VARCHAR(200),
dataHorarioTermino VARCHAR(200)
);