-- Estrutura do banco do projeto Balança mas não cai.
-- Extraída do dump da atividade; sem registros de usuários.
CREATE DATABASE IF NOT EXISTS `balanca_mas_nao_cai` CHARACTER SET utf8mb4;
USE `balanca_mas_nao_cai`;

CREATE TABLE `engenheiros` (
  `idEngenheiro` int NOT NULL AUTO_INCREMENT,
  `dsNome` varchar(60) NOT NULL,
  `nrCREA` varchar(20) NOT NULL,
  `dtAdmissao` date NOT NULL,
  PRIMARY KEY (`idEngenheiro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `fases` (
  `idFase` int NOT NULL AUTO_INCREMENT,
  `dsFase` varchar(45) NOT NULL,
  PRIMARY KEY (`idFase`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `funcoes` (
  `idFuncao` int NOT NULL AUTO_INCREMENT,
  `dsFuncao` varchar(45) NOT NULL,
  PRIMARY KEY (`idFuncao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `obras` (
  `idObra` int NOT NULL AUTO_INCREMENT,
  `Descricao` varchar(150) NOT NULL,
  `dtInicio` date NOT NULL,
  `dtFim` date DEFAULT NULL,
  `idEngenheiro` int NOT NULL,
  `nrCrea` varchar(20) DEFAULT NULL,
  `dtDdmissaoEngenheiro` date NOT NULL,
  PRIMARY KEY (`idObra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `obras_engenheiros` (
  `idObra` int NOT NULL,
  `idEngenheiro` int NOT NULL,
  `dtAdmissaoEngenheiro` date NOT NULL,
  `dtInicioTrabalho` date NOT NULL,
  `dtFimTrabalho` date NOT NULL,
  `idFuncao` int NOT NULL,
  PRIMARY KEY (`idObra`,`idEngenheiro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `obras_fases` (
  `idObra` int NOT NULL,
  `idFase` int NOT NULL,
  `dtIniciofase` date DEFAULT NULL,
  `dtTerminoFase` date DEFAULT NULL,
  PRIMARY KEY (`idObra`,`idFase`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `orcamentos` (
  `idOrcamento` int NOT NULL AUTO_INCREMENT,
  `dtAprovacao` date DEFAULT NULL,
  `idEngenheiroResponsavel` int NOT NULL,
  PRIMARY KEY (`idOrcamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `orcamentos_obras` (
  `idOrcamento` int NOT NULL,
  `idObra` int NOT NULL,
  `dtInicio` date DEFAULT NULL,
  `dtFim` date DEFAULT NULL,
  `vlPrevisto` decimal(10,2) DEFAULT '0.00',
  `vlRealizado` decimal(10,2) DEFAULT '0.00',
  PRIMARY KEY (`idOrcamento`,`idObra`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `usuarios` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `Nome` varchar(50) NOT NULL,
  `Email` varchar(80) NOT NULL,
  `Senha` varchar(12) NOT NULL DEFAULT '123456',
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
